package com.hessel.treinoDevSup.IntensivoJava.Entities;

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
	private String faixa;
	private Double valorInicial;
	private Double valorFinal;
	private Double valorMaxPorFaixa;
	private Double porcentagemFaixa;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFaixa() {
		return faixa;
	}
	public void setFaixa(String faixa) {
		this.faixa = faixa;
	}
	public Double getValorInicial() {
		return valorInicial;
	}
	public void setValorInicial(Double valorInicial) {
		this.valorInicial = valorInicial;
	}
	public Double getValorFinal() {
		return valorFinal;
	}
	public void setValorFinal(Double valorFinal) {
		this.valorFinal = valorFinal;
	}
	public Double getValorMaxPorFaixa() {
		return valorMaxPorFaixa;
	}
	public void setValorMaxPorFaixa(Double valorMaxPorFaixa) {
		this.valorMaxPorFaixa = valorMaxPorFaixa;
	}
	public Double getPorcentagemFaixa() {
		return porcentagemFaixa;
	}
	public void setPorcentagemFaixa(Double porcentagemFaixa) {
		this.porcentagemFaixa = porcentagemFaixa;
	}



}
