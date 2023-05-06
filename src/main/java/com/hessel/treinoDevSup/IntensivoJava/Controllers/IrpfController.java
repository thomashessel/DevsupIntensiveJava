package com.hessel.treinoDevSup.IntensivoJava.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hessel.treinoDevSup.IntensivoJava.Entities.Irpf;
import com.hessel.treinoDevSup.IntensivoJava.Services.IrpfService;

@RestController
@RequestMapping(value="/irpf")
public class IrpfController {
	
	@Autowired
	private IrpfService irpfService;
	
	@GetMapping(value="/all")
	public List<Irpf> paranAllValues(){
		return irpfService.findAll();
	}
	@GetMapping(value="/{id}")
	public Irpf paramByIdValue (@PathVariable("id") Long id) {
		return irpfService.findId(id);
	}

}
