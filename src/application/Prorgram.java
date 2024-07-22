package application;

import java.util.Locale;
import java.util.Scanner;

public class Prorgram {

	public static void main(String[] args) {
		// exercicioCadaLinha-DevSuperior
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		

		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		int[] maiorElementoLinha = new int[n];
		
		int[][] matriz = new int[n][n];
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.printf("Elemento [%d,%d]: ",i,j);
				matriz[i][j] = sc.nextInt();
				if(maiorElementoLinha[i] < matriz[i][j]) {
					maiorElementoLinha[i] = matriz[i][j];
				}
			}
		}
		
		System.out.println("MAIOR ELEMENTO DE CADA LINHA: ");
		for(int i = 0; i < matriz.length; i++) {
			System.out.println(maiorElementoLinha[i]);
			
		}
		
		sc.close();
	}

}
