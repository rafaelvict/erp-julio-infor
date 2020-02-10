package com.erp.adm.service;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.adm.domain.Usuario;
import com.erp.adm.repositories.UsuarioRepository;


@Service
public class UsuarioService implements Serializable{
	private static final long serialVersionUID = 1L;

	@Autowired
	private UsuarioRepository repo;

	public Usuario buscar(Long id) {
		Optional<Usuario> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
