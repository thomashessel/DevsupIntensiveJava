package com.hessel.treinoDevSup.IntensivoJava.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hessel.treinoDevSup.IntensivoJava.Entities.Irpf;
import com.hessel.treinoDevSup.IntensivoJava.Repositories.IrpfRepository;

@Service
public class IrpfService {

	@Autowired
	private IrpfRepository irpfResp;
		
	public List<Irpf> findAll() {
		List<Irpf> result =irpfResp.findAll();
		return result;

	}
	public Irpf findId(Long id) {
		return irpfResp.findById(id).get();
	}
}
