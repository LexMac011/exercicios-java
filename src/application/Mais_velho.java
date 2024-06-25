package application;

import java.util.Scanner;

public class Mais_velho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// VARIAVEIS E VETORES
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		String [] nomes = new String[n];
		int [] idades = new int[n];
		// LOOP DADOS 
		
		for (int i=0;i<n;i++) {
			System.out.printf("Dados da %da pessoa: ", i+1);
			System.out.println();
			
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}
		
		// LOOP PARA COMPARAR IDADES 
		int maior = idades[0];
		int pos = 0;
				
		for (int i=0;i<n;i++) {
			if (idades[i] > maior) {
				maior = idades[i];
				pos = i;
			}
		}
		
		
		System.out.printf("Pessoa mais velha: %s", nomes[pos]);
		
		sc.close();
	}

}
