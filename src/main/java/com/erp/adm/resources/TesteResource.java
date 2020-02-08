package com.erp.adm.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.erp.adm.domain.Estado;

@RestController
@RequestMapping(value = "/testes")
public class TesteResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Estado> listar() {
		
		Estado estado1 = new Estado("MG", "Minas Gerais");
		Estado estado2 = new Estado("SP", "São Paulo");
		
		List<Estado> estados = new ArrayList<>();
		estados.add(estado1);
		estados.add(estado2);
		
		return estados;
	}
	
}
