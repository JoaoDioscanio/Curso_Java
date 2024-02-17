package aulas;

public class ForEach {

	public static void main(String[] args) {
		// Leitura: "para cada objeto 'obj' contido em vect, faça:"
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		for (int i=0; i< vect.length; i++) {
		System.out.println(vect[i]);
		}
		for (String obj : vect) {
		System.out.println(obj);
		}

	}

}
