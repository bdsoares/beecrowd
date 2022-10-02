package beecrowd.iniciante;

/**
 * Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.
 *
 * Entrada
 * O arquivo de entrada contém dois valores inteiros.
 *
 * Saída
 * O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares que estão entre
 * os valores fornecidos na entrada que deverá caber em um inteiro.
 */

import java.util.Scanner;

public class P1071 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] n = new int[3];
		
		for (int i = 0; i < n.length-1; i++) 
			n[i] = in.nextInt();
		
		for (int i = n[1]; i < n[0]; i++) {
			if (i % 2 != 0 && i != n[0] && i != n[1])
				n[2] += i;
		}
		
		System.out.println(n[2]);
		
		in.close();
	}

}
