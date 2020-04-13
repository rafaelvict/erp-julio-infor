package com.erp.adm.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.erp.adm.domain.Fornecedor;
import com.erp.adm.dto.FornecedorDTO;
import com.erp.adm.dto.FornecedorNewDTO;
import com.erp.adm.services.FornecedorService;


@RestController
@RequestMapping(value = "/fornecedores")
public class FornecedorResource {

	@Autowired
	private FornecedorService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Fornecedor> find(@PathVariable Long id) {
		Fornecedor	 obj = service.find(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody FornecedorNewDTO objDTO){
		Fornecedor obj = service.fromDTO(objDTO);
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("{/id}").buildAndExpand(obj.getCodigo()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@Valid @RequestBody FornecedorDTO objDTO, @PathVariable Long id){
		Fornecedor obj = service.fromDTO(objDTO);
		obj.setCodigo(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<FornecedorDTO>> findAll(){
		List<Fornecedor> list = service.findAll();
		List<FornecedorDTO> listDto = list.stream().map(obj ->  new FornecedorDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
}
