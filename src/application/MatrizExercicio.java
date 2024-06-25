package application;

import java.util.Scanner;

public class MatrizExercicio {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		// LENDO OS NÚMEROS PARA A MATRIZ
		int m = Integer.parseInt(sc.nextLine());
		int n = Integer.parseInt(sc.nextLine());
		
		// MATRIZ
		int[][] mat = new int[m][n];
		// VARIAVEIS PARA AS POSIÇOES
		
		int num = 0;
		
		for (int i=0; i<m;i++) {
			for (int j=0; j<n; j++) {
					mat[i][j] = sc.nextInt();
				}
			}
		num = sc.nextInt();
		sc.nextLine();
		for (int i=0; i<m;i++) {
			for (int j=0; j<n; j++) {
					if (mat[i][j] == num) {
						System.out.println("Position: "+i+","+j);
						if (i > 0) {
							System.out.println("Up: "+mat[i-1][j]);
						}
						if (i < mat.length-1) {
							System.out.println("Down: "+mat[i+1][j]);
						}
						if (j > 0) {
							System.out.println("Left: "+mat[i][j-1]);
						}
						if (j < mat[i].length-1) {
							System.out.println("Right: "+mat[i][j+1]);
						}
							
						
						
					}
				}
			}
		
		
		sc.close();
		}
}		

