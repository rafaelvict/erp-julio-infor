package com.erp.adm.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.erp.adm.domain.ProprietarioSocio;
import com.erp.adm.dto.ProprietarioSocioDTO;
import com.erp.adm.dto.ProprietarioSocioNewDTO;
import com.erp.adm.services.ProprietarioSocioService;

@RestController
@RequestMapping(value = "/proprietarioSocios")
public class ProprietarioSocioResource {
	
	@Autowired
	private ProprietarioSocioService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<ProprietarioSocio> find(@PathVariable Long id){
		ProprietarioSocio obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody ProprietarioSocioNewDTO objDTO){
		ProprietarioSocio obj = service.fromDTO(objDTO);
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("{/id}").buildAndExpand(obj.getCodigo()).toUri();
		return ResponseEntity.created(uri).build();
		
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@Valid @RequestBody ProprietarioSocioDTO objDTO, @PathVariable Long id){
		ProprietarioSocio obj = service.fromDTO(objDTO);
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
	public ResponseEntity<List<ProprietarioSocioDTO>> findAll(){
		List<ProprietarioSocio> list = service.findAll();
		List<ProprietarioSocioDTO> listDto = list.stream().map(obj ->  new ProprietarioSocioDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	@RequestMapping(value="/page", method=RequestMethod.GET)
	public ResponseEntity<Page<ProprietarioSocioDTO>> findPage(
			@RequestParam(value="page", defaultValue="0") Integer page, 
			@RequestParam(value="linesPerPage", defaultValue="24") Integer linesPerPage, 
			@RequestParam(value="orderBy", defaultValue="nome") String orderBy, 
			@RequestParam(value="direction", defaultValue="ASC") String direction) {
		Page<ProprietarioSocio> list = service.findPage(page, linesPerPage, orderBy, direction);
		Page<ProprietarioSocioDTO> listDto = list.map(obj ->  new ProprietarioSocioDTO(obj));
		return ResponseEntity.ok().body(listDto);
	}

}