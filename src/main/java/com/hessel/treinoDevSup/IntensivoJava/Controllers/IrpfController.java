package com.hessel.treinoDevSup.IntensivoJava.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hessel.treinoDevSup.IntensivoJava.Entities.Irpf;
import com.hessel.treinoDevSup.IntensivoJava.Repositories.IrpfRepository;

@RestController
@RequestMapping(value="/irpf")
public class IrpfController {
	
	@Autowired
	private IrpfRepository irpf;
	
	@GetMapping(value="/all")
	public List<Irpf> paranValues(){
		List<Irpf> lista = irpf.findAll();
		return lista;
	}
	@GetMapping(value="/{id}")
	public Irpf paramByIdValue (@PathVariable("id") Long id) {
		Irpf _irpf = irpf.findById(id).get();
		return _irpf;
	}

}
