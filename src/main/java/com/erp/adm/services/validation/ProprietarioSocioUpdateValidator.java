package com.erp.adm.services.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerMapping;

import com.erp.adm.domain.ProprietarioSocio;
import com.erp.adm.dto.ProprietarioSocioDTO;
import com.erp.adm.repositories.ProprietarioSocioRepository;
import com.erp.adm.resources.exception.FieldMessage;

public class ProprietarioSocioUpdateValidator implements ConstraintValidator<ProprietarioSocioUpdate, ProprietarioSocioDTO> {

	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private ProprietarioSocioRepository repo;
	
	@Override
	public void initialize(ProprietarioSocioUpdate ann) {
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public boolean isValid(ProprietarioSocioDTO objDto, ConstraintValidatorContext context) {
		
		@SuppressWarnings("unchecked")
		Map<String, String> map = (Map<String, String>) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
		Integer uriId = Integer.parseInt(map.get("id"));
		
		List<FieldMessage> list = new ArrayList<>();
		
		ProprietarioSocio aux = repo.findByEmail(objDto.getEmail());
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
