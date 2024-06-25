package application;

import java.util.Locale;
import java.util.Scanner;

public class Abaixo_media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		// VETOR 
		double [] vet = new double[n];
		// LOOP PARA ADICIONAR OS NÚMEROS NO VETOR
		for (int i=0;i<n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
		}
		
		double sum = 0;
		for (int i=0;i<n;i++) {
			sum += vet[i];
		}
		double media = sum / n;
		
		System.out.printf("MEDIA DE VETOR = %.3f", media);
		System.out.println();
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
		for (int i=0;i<n;i++) {
			if (vet[i] < media) {
				System.out.println(vet[i]);
				
			}
		}
		sc.close();
	}

}
