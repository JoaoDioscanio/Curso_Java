package entidades;

public class Aluno {
	public String nome;
	public double trimestre1;
	public double trimestre2;
	public double trimestre3;
	public void analise() {
		double notaFinal = trimestre1 + trimestre2 + trimestre3;
		if (notaFinal < 60.0) {
			System.out.printf("FINAL GRADE = %.2f\nFAILED",notaFinal);
			double pontosFaltando = 100 - notaFinal;
			System.out.printf("MISSING POINTS = %.2f",pontosFaltando);
			return;
		}
		else {
			System.out.printf("FINAL GRADE = %.2f\nPASS",notaFinal);
			return;
		}
	}
}
