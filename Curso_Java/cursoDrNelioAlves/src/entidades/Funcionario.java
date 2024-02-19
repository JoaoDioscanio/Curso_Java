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
	public Funcionario() {	
	}
	public Funcionario(int tag, String nome, double salario) {
		super();
		this.tag = tag;
		this.nome = nome;
		this.salario = salario;
	}
	public void aumentarSalario(double porcentagem) {
		salario += salario * porcentagem / 100;
	}
	@Override
	public String toString() {
		return tag + ", " + nome + ", " + String.format("%.2f", salario);
	}
}
