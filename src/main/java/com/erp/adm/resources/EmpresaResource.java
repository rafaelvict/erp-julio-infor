package com.erp.adm.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.erp.adm.domain.Empresa;
import com.erp.adm.service.EmpresaService;

@RestController
@RequestMapping(value = "/empresas")
public class EmpresaResource {
	
	@Autowired
	private EmpresaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Long id){
		Empresa obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
