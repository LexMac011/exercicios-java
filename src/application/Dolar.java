package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.CurrencyConverter;

public class Dolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollar = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		
		double howmany = sc.nextDouble();
		CurrencyConverter.valueConvert(dollar, howmany);
		CurrencyConverter.iofCalc();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.conversion + CurrencyConverter.iof);
			
		
		
		sc.close();
	}

}
