package entidades;

public class Estudante {
	private String nome,mail;
	private int quarto;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getQuarto() {
		return quarto;
	}
	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}
	public Estudante(String nome, String mail, int quarto) {
		super();
		this.nome = nome;
		this.mail = mail;
		this.quarto = quarto;
	}
	
}
