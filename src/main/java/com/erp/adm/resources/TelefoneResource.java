package com.erp.adm.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.erp.adm.domain.Telefone;
import com.erp.adm.service.TelefoneService;


@RestController
@RequestMapping(value = "/telefones")
public class TelefoneResource {
	
	@Autowired
	private TelefoneService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Long id) {
		Telefone obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		
	}
}
