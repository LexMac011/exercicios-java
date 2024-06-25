package application;

import java.util.Locale;
import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		int[] vet = new int[n];
		
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextInt();
		}
		int count = 0;
		System.out.println();
		System.out.println("NÚMEROS PARES:");
		for (int i=0; i<n; i++) {
			if (vet[i] % 2 == 0) {
				System.out.printf("%d ", vet[i]);
				count++;
			}
		}
		System.out.println();
		System.out.println("QUANTIDADE DE PARES: " + count);
		
		sc.close();
	}

}
