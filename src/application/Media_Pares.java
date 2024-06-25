package application;

import java.util.Locale;
import java.util.Scanner;

public class Media_Pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int [] vet = new int[n];
		double sum = 0;
		int count = 0;
		
		// LOOP PARA ADICIONAR OS NÚMEROS NO VETOR
		for (int i=0;i<n;i++) {
			System.out.print("Digite um número: ");
			
			vet[i] = sc.nextInt();
			if (vet[i] % 2 == 0) {
				sum += vet[i];
				count++;
			}
		}
		if (count == 0) {
			System.out.println("NENHUM NÚMERO PAR");
		}
		else {
			System.out.printf("MEDIA DOS PARES %.1f", sum / count);
		}
		
		sc.close();
		
	}

}
