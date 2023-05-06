package com.hessel.treinoDevSup.IntensivoJava.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hessel.treinoDevSup.IntensivoJava.Entities.Inss;
import com.hessel.treinoDevSup.IntensivoJava.Repositories.InssRepository;

@Service
public class InssService {

	@Autowired
	private InssRepository inssResp;
		
	public List<Inss> findAll() {
		List<Inss> result =inssResp.findAll();
		return result;

	}
	public Inss findId(Long id) {
		return inssResp.findById(id).get();
	}
}
