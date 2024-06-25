package application;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		// ODEIO TER QUE COLOCAR ESSA LINHA PRA CONSUMIR O BUFFER
		
		// VETORES 
		String[] nomes = new String[n]; 
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		double[] medias = new double[n];
		
		// LOOPING PARA ADICIONAR OS DADOS NOS VETORES
		for (int i=0; i<n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: ", i+1);
			sc.nextLine();
			nomes[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		//  LOOP PARA CALCULAR AS MÉDIAS
		double media;
		
		for (int i=0;i<n;i++) {
			media = (nota1[i] + nota2[i]) / 2;
			medias[i] = media;	
		}
		System.out.println("Alunos aprovados:");
		for (int i=0;i<n; i++) {
			if (medias[i] >= 6) {
				System.out.println(nomes[i]);
			}
		}
		sc.close();
	}

}
