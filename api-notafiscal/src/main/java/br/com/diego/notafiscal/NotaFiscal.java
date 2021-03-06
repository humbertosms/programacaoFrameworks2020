package br.com.diego.notafiscal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "notafiscal")
public class NotaFiscal {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String empresa;
	private Double imposto;
	private Double valorBruto;

	public NotaFiscal(String empresa, Double imposto, Double valorBruto) {
		super();
		this.empresa = empresa;
		this.imposto = imposto;
		this.valorBruto = valorBruto;
	}
	
	public NotaFiscal(Long id,String empresa, Double imposto, Double valorBruto) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.imposto = imposto;
		this.valorBruto = valorBruto;
	}
	
	public NotaFiscal() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}

	public Double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(Double valorBruto) {
		this.valorBruto = valorBruto;
	}
}