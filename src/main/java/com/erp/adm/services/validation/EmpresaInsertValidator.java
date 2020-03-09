package com.erp.adm.services.validation;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.erp.adm.domain.Empresa;
import com.erp.adm.dto.EmpresaNewDTO;
import com.erp.adm.repositories.EmpresaRepository;
import com.erp.adm.resources.exception.FieldMessage;

public class EmpresaInsertValidator implements ConstraintValidator<EmpresaInsert, EmpresaNewDTO> {

	@Autowired
	private EmpresaRepository repo;
	
	@Override
	public void initialize(EmpresaInsert ann) {
	}

	@Override
	public boolean isValid(EmpresaNewDTO objDto, ConstraintValidatorContext context) {
		
		List<FieldMessage> list = new ArrayList<>();
		
		Empresa aux = repo.findByEmail(objDto.getEmail());
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
