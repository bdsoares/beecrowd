package beecrowd.iniciante;

/**
 * Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.
 *
 * Entrada
 * O arquivo de entrada contém 100 números inteiros, positivos e distintos.
 *
 * Saída
 * Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
 */

import java.util.Scanner;

public class P1080 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] n = new int[100];
		int[] result = new int[2];
		
		for (int i = 0; i < n.length; i++) {
			n[i] = in.nextInt();
			
			if (n[i] > result[0]) {
				result[0] = n[i];
				result[1] = i+1;
			}
		}
		
		for (int i = 0; i < result.length; i++)
			System.out.println(result[i]);
		
		in.close();
	}

}
