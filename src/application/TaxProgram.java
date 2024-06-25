package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

import model.entities.Company;
import model.entities.Individual;
import model.entities.TaxPayer;

public class TaxProgram {

	public static void main(String[] args) {
		
		//Lista marota
		List<TaxPayer> lista = new ArrayList<>();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//PEGANDO NUMERO PARA COMEÇAR LOOP
		System.out.print("Enter the number of tax payers: ");
		Integer n = Integer.parseInt(sc.nextLine());
		
		// AGORA O LOOP MASSA
		for (int i = 1; i <= n; i++) {
			System.out.printf("Tax payer #%d data: \n", i);
			System.out.print("Individual or company (i/c)? ");
			String opc = sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = Double.parseDouble(sc.nextLine());
			if (Objects.equals("i", opc)) {
				System.out.print("Health expenditures: ");
				Double health = Double.parseDouble(sc.nextLine());
				lista.add(new Individual(name, anualIncome, health));
			}
			else if (Objects.equals("c", opc)) {
				System.out.print("Number of employees: ");
				Integer emp = Integer.parseInt(sc.nextLine());
				lista.add(new Company(name, anualIncome, emp));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer taxp : lista) {
			System.out.println(taxp.toString());
		}
		System.out.println();			// FIZ DOIS LOOPS ATOA, PODERIA TER APROVEITADO O PRIMEIRO PRA JA FAZER A SOMA
		Double total = 0.0;
		for (TaxPayer taxp : lista) {
			total += taxp.tax();
		}
		System.out.printf("TOTAL TAXES:  $%s", String.format("%.2f", total));
		
		sc.close();
	}

}
