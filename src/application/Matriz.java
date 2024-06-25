package application;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		// DECLARAÇÃO MATRIZ
		int[][] mat = new int[n][n];
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				mat[i][j] = Integer.parseInt(sc.nextLine());
			}
		}
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.print(mat[i][j]+" ");
			}
		}
		System.out.println();
		
		System.out.println("Main diagonal:");
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				if (mat[i] == mat[j]) {
					System.out.print(mat[i][j]+" ");
				}
			}
		}
		System.out.println();
		int a = 0;
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				if (mat[i][j] < 0)
					a++;
			}
		}
		
		System.out.printf("Negative numbers: %d ", a);
		
		sc.close();
	}

}
