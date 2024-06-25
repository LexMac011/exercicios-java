package application;

import java.util.Locale;
import java.util.Scanner;

public class Dados_pessoas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		// PROBLEMA DO BUFFER RESOLVIDO
		int n = Integer.parseInt(sc.nextLine());
		// PARSEINT OU DOUBLE É UMA MÃO NA RODA ALEXA KARAIOOOOOO
		
		// VETORES USADOS 
		double[] alturaF = new double[n];
		double[] alturaGeral = new double[n];
		
		// LOOP PARA ARMAZENAR OS DADOS
		for (int i=0;i<n;i++) {
			System.out.printf("Altura da %do pessoa: ", i+1);
			alturaGeral[i] = Double.parseDouble(sc.nextLine());
			
			System.out.printf("Genero da %do pessoa: ", i+1);
			String genero = sc.nextLine();
			switch(genero) {
			case "F":
				alturaF[i] = alturaGeral[i];
				break;
			case "f":
				alturaF[i] = alturaGeral[i];
			}
		}////////////	nao consegui fazer :c
		// LÓGICA DE MAIOR E MENOR
		double maior = 0, menor = 0;
		double pos = alturaGeral[0];
		for (int i=0;i<n;i++) {
			if (alturaGeral[i] > pos) {
				maior = alturaGeral[i];
				//menor = alturaGeral[pos];
			}
		}
		System.out.printf("maior %d, menor %d", maior, menor);
		
		sc.close();
	}
	
	
}