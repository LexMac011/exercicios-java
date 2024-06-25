package application;
import java.util.Locale;
import java.util.Scanner;

import model.entities.BankAccount;

public class Bank {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String n = sc.nextLine();
		
		System.out.println("Is there an initial deposit (y/n)? ");
		String s = sc.nextLine();
		double dep = 0;
		
		switch (s) {
		case "y":
			System.out.print("Enter the initial deposit value: ");
			dep = sc.nextDouble();
			break;
		case "n":
			break;
		}
		BankAccount bk = new BankAccount(id, n, dep);
		System.out.println("Account data:");
		System.out.printf("Account: %d, Holder: %s, Balance: $ %.2f", bk.getAc_number(), bk.getName(), bk.getBalance());
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		bk.deposit(sc.nextDouble());
		bk.update();
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		bk.withdraw(sc.nextDouble());
		bk.update();
	
		
		sc.close();
	}

}
