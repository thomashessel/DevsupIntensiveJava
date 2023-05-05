package com.hessel.treinoDevSup.IntensivoJava.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hessel.treinoDevSup.IntensivoJava.Entities.Irpf;
import com.hessel.treinoDevSup.IntensivoJava.Repositories.IrpfRepository;

@RestController
@RequestMapping(value="/irpf")
public class IrpfController {
	
	@Autowired
	private IrpfRepository irpf;
	
	@GetMapping
	public List<Irpf> paranValues(){
		List<Irpf> lista = irpf.findAll();
		return lista;
	}
	

}
