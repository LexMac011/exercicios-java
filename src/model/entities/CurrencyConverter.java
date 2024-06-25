package model.entities;

public class CurrencyConverter {
	
	public static double conversion = 0.0;
	public static double iof = 0.0;
	
	public static double valueConvert(double cot, double value) {
		return conversion = cot * value;
	}
	public static void iofCalc() {
		iof = (conversion * 6) / 100;
	}
}
