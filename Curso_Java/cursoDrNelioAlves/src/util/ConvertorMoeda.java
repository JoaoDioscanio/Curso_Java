package util;

public class ConvertorMoeda {
	public static double total;
	public static final double IOF = 6.0;
	public static void total(double dolar, double qtD) {
		total = dolar * qtD + (1+(IOF/100));
	}
	public String toString() {
		return "Amount to be paid in R$ "
				+ String.format("%.2f", (total));
		// Fazer ajuste final para retornar valor sem erro.
	}
}
