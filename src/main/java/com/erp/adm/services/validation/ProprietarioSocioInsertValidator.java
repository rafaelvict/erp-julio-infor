package com.erp.adm.services.validation;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.erp.adm.domain.ProprietarioSocio;
import com.erp.adm.dto.ProprietarioSocioNewDTO;
import com.erp.adm.enums.TipoPessoa;
import com.erp.adm.repositories.ProprietarioSocioRepository;
import com.erp.adm.resources.exception.FieldMessage;
import com.erp.adm.services.validation.utils.BR;

public class ProprietarioSocioInsertValidator implements ConstraintValidator<ProprietarioSocioInsert, ProprietarioSocioNewDTO> {

	@Autowired
	private ProprietarioSocioRepository repo;
	
	@Override
	public void initialize(ProprietarioSocioInsert ann) {
	}

	@Override
	public boolean isValid(ProprietarioSocioNewDTO objDto, ConstraintValidatorContext context) {

		List<FieldMessage> list = new ArrayList<>();

		if (objDto.getPessoa().equals(TipoPessoa.PESSOA_FISICA.getCodigo()) && !BR.isValidCPF(objDto.getCpfCnpj())) {
			list.add(new FieldMessage("cpfCnpj", "CPF inválido"));
		}

		if (objDto.getPessoa().equals(TipoPessoa.PESSOA_JURIDICA.getCodigo()) && !BR.isValidCNPJ(objDto.getCpfCnpj())) {
			list.add(new FieldMessage("cpfCnpj", "CNPJ inválido"));
		}
		
		ProprietarioSocio aux = repo.findByEmail(objDto.getEmail());
		if (aux != null) {
			list.add(new FieldMessage("email", "Email já existente"));
		}

		for (FieldMessage e : list) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
					.addConstraintViolation();
		}
		return list.isEmpty();
	}
}