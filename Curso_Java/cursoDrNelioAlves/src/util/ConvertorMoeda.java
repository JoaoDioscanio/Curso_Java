package util;

public class ConvertorMoeda {
	public static final double IOF = 6.0;
	public static double total(double dolar, double qtD) {
		return dolar * qtD *(1+(IOF/100));
	}
}
