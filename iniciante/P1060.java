package beecrowd.iniciante;

/**
 * Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos
 * (desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.
 *
 * Entrada
 * Seis valores, negativos e/ou positivos.
 *
 * Saída
 * Imprima uma mensagem dizendo quantos valores positivos foram lidos.
 */

import java.util.Scanner;

public class P1060 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double n[] = new double[6];
		int count = 0;
		
		for (int i = 0; i < n.length; i++) {
			n[i] = in.nextDouble();
			
			if (n[i] >= 0)
				count++;
		}
		
		System.out.println(count + " valores positivos");
		
		in.close();
	}

}
