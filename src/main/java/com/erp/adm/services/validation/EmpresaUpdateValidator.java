package com.erp.adm.services.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerMapping;

import com.erp.adm.domain.Empresa;
import com.erp.adm.dto.EmpresaDTO;
import com.erp.adm.repositories.EmpresaRepository;
import com.erp.adm.resources.exception.FieldMessage;

public class EmpresaUpdateValidator implements ConstraintValidator<EmpresaUpdate, EmpresaDTO> {

	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private EmpresaRepository repo;
	
	@Override
	public void initialize(EmpresaUpdate ann) {
	}

	@Override
	public boolean isValid(EmpresaDTO objDto, ConstraintValidatorContext context) {
		
		@SuppressWarnings("unchecked")
		Map<String, String> map = (Map<String, String>) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
		Integer uriId = Integer.parseInt(map.get("id"));
		
		List<FieldMessage> list = new ArrayList<>();
		
		Empresa aux = repo.findByEmail(objDto.getEmail());
		if (aux != null && !aux.getCodigo().equals(uriId)) {
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
