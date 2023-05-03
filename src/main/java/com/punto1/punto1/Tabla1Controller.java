package com.punto1.punto1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({ "/tabla1" })
public class Tabla1Controller {
	
	@Autowired
	Tabla1Service service;
	
	public List<Tabla1>listar(){
		return service.listar();
	}

}
