package com.erp.adm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.adm.domain.Estado;
import com.erp.adm.repositories.EstadoRepository;

@Service
public class DBService {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	public void instantiateTestDataBase() {
		
		Estado est1 = new Estado("AC", "Acre");
		Estado est2 = new Estado("RO", "Roraima");
		
		estadoRepository.save(est1);
		estadoRepository.save(est2);
	}
}
