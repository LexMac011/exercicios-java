package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.WithDrawException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		try {
			// PEGANDO OS DADOS E INSTANCIANDO O OBJETO
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = Integer.parseInt(sc.nextLine());
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double initialB = Double.parseDouble(sc.nextLine());
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = Double.parseDouble(sc.nextLine());
			
			Account acc = new Account(number, holder, initialB, withdrawLimit);
			
			System.out.println();
			
			System.out.print("Enter amount for withdraw: ");
			Double amount = Double.parseDouble(sc.nextLine());
			
			acc.withdraw(amount);
			System.out.println("New Balance: " + String.format("%.2f",acc.getBalance()));
		}
		catch (WithDrawException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		
		sc.close();
	}

}
