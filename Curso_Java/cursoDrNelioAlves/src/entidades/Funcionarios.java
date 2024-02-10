package entidades;

public class Funcionarios {
	public String nome;
	public double SalarioBruto;
	public double Imposto;
	public double SalarioLiquido() {
		double salarioNet = SalarioBruto - Imposto;
		return salarioNet;
	}
	public void AumentarSalario(double porcentagem) {
		this.SalarioBruto = SalarioBruto * (1+(porcentagem/100));
	}
	public String toString() {
		return nome
			+ ", $"
			+ String.format(" %.2f\n", SalarioLiquido());
	}
}
