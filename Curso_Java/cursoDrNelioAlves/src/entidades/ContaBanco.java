package entidades;

public class ContaBanco {
	// Cadastro
	private final long tagConta;
	private String nomeTitular;
	private double saldoTitular;
	public double getSaldoTitular() {
		return saldoTitular;
	}
	public ContaBanco(long tagConta, String nomeTitular) {
		super();
		this.tagConta = tagConta;
		this.nomeTitular = nomeTitular;
	}
	public ContaBanco(long tagConta, String nomeTitular, double depositoInicial) {
		super();
		this.tagConta = tagConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
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
	public double deposito(double valorDeposito) {
		saldoTitular += valorDeposito;
		return saldoTitular;
	}
	public double saque(double valorSaque) {
		// Tarifa de $5 por saque
		saldoTitular -= (valorSaque + 5.00);
		return saldoTitular;
	}

	@Override
	public String toString() {
		return String.format("\nAccount %d, Holder: %s, Balance: $ %.2f", tagConta, nomeTitular, saldoTitular);
	}
	
}