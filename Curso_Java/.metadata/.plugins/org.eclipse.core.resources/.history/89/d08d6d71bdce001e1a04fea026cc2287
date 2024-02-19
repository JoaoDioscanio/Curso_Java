package entidades;

public class Funcionario {
	private String nome;
	private int tag;
	private double salario;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
	public double getSalario() {
		return salario;
	}
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	public double aumentarSalario(double salario, double porcentagem) {
		salario = salario*porcentagem;
		return salario*(1+(porcentagem/100));
		
	}
}
