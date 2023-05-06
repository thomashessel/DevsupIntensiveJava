package com.hessel.treinoDevSup.IntensivoJava.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hessel.treinoDevSup.IntensivoJava.Entities.Inss;
import com.hessel.treinoDevSup.IntensivoJava.Services.InssService;

@RestController
@RequestMapping(value="/inss")
public class InssController {

	@Autowired
	private InssService inssService;
	
	@GetMapping(value="/all")
	public List<Inss> paranAllValues(){			
		return inssService.findAll();
	}
	@GetMapping(value="/{id}")
	public Inss paramByIdValue (@PathVariable("id") Long id) {
		return inssService.findId(id);
	}
}
