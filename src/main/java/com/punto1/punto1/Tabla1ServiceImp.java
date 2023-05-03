package com.punto1.punto1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Tabla1ServiceImp implements Tabla1Service{
	
	@Autowired
	private Tabla1Repositorio repositorio;
	
	@Override
	public List<Tabla1> listar() {
		return repositorio.findAll();
	}

}
