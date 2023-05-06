package com.hessel.treinoDevSup.IntensivoJava.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hessel.treinoDevSup.IntensivoJava.Entities.Inss;
import com.hessel.treinoDevSup.IntensivoJava.Repositories.InssRepository;

@RestController
@RequestMapping(value="/inss")
public class InssController {

	@Autowired
	private InssRepository inss;
	
	@GetMapping(value="/all")
	public List<Inss> paranAllValues(){
		List<Inss> lista = inss.findAll();
		return lista;
	}
	@GetMapping(value="/{id}")
	public Inss paramByIdValue (@PathVariable("id") Long id) {
		Inss _inss = inss.findById(id).get();
		return _inss;
	}
}
