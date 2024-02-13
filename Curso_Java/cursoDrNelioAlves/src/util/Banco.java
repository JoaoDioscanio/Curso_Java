package util;

public class Banco {
	// Cadastro
	private final long tagConta;
	private String nomeTitular;
	private double saldoTitular;
	public double getSaldoTitular() {
		return saldoTitular;
	}
	public void setSaldoTitular(double saldoTitular) {
		this.saldoTitular = saldoTitular;
	}
	public Banco(long tagConta, String nomeTitular) {
		super();
		this.tagConta = tagConta;
		this.nomeTitular = nomeTitular;
	}
	public Banco(long tagConta, String nomeTitular, double saldoTitular) {
		super();
		this.tagConta = tagConta;
		this.nomeTitular = nomeTitular;
		this.saldoTitular = saldoTitular;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public long getTagConta() {
		return tagConta;
	}
}