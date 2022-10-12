package beecrowd.iniciante;

/**
 * Faça um programa que mostre os números pares entre 1 e 100, inclusive.
 *
 * Entrada
 * Neste problema extremamente simples de repetição não há entrada.
 *
 * Saída
 * Imprima todos os números pares entre 1 e 100, inclusive se for o caso, um em cada linha.
 */

import java.util.Scanner;

public class P1059 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for (int i = 1; i <= 100; i++)
			if (i % 2 == 0)
				System.out.println(i);
		
		in.close();
	}

}
