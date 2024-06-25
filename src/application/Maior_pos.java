package application;

import java.util.Locale;
import java.util.Scanner;

public class Maior_pos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double[] vet = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
		}
		// LÓGICA PARA ENCONTRAR O MAIOR VALOR
		double maior = 0.0;
		int pos = 0;
		
		for (int i=0; i<vet.length-2; i++) {
			if (vet[i] > vet[i+1] && vet[i] > vet[i+2]) {
				maior = vet[i];
				pos = i;
			}
			else {
				maior = vet[i+1];
				pos = i+1;
			}
		}
		System.out.println();
		System.out.println("MAIOR VALOR = "+ maior);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + pos);
		
		
		sc.close();
	}

}
