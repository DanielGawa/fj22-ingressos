package br.com.caelum.ingresso.model;

import java.time.YearMonth;

public class Cartao {
	
	private String numero;
	private Integer cvv;
	private YearMonth vencimento;
	public String getNumero() {
		return numero;
	}
	public Integer getCvv() {
		return cvv;
	}
	public YearMonth getVencimento() {
		return vencimento;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}
	public void setVencimento(YearMonth vencimento) {
		this.vencimento = vencimento;
	}
	
	public boolean isValido(){
		return vencimento.isAfter(YearMonth.now());
	}
	
	

}
