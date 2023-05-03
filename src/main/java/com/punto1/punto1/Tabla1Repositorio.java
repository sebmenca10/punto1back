package com.punto1.punto1;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface Tabla1Repositorio extends Repository<Tabla1, Integer>{
	List<Tabla1>findAll();

}
