package com.hessel.treinoDevSup.IntensivoJava.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="param_Inss")
public class Inss {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name ="fxName")
	private String faixa;
	
	@Column (name ="vlInicial")
	private Double valorInicial;
	
	@Column (name ="vlFinal")
	private Double valorFinal;
	
	@Column (name ="vlMaxFx")
	private Double valorMaxPorFaixa;
	
	@Column (name ="percentFx")
	private Double porcentagemFaixa;
	
	
	public Long getId() {
		return id;
	}	
	public String getFaixa() {
		return faixa;
	}
	public Double getValorInicial() {
		return valorInicial;
	}
	public Double getValorFinal() {
		return valorFinal;
	}
	public Double getValorMaxPorFaixa() {
		return valorMaxPorFaixa;
	}
	public Double getPorcentagemFaixa() {
		return porcentagemFaixa;
	}


}
