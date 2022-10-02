package beecrowd.iniciante;

/**
 * Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão resto
 * igual a 2.
 *
 * Entrada
 * A entrada contém um valor inteiro N (N < 10000).
 *
 * Saída
 * Imprima todos valores que quando divididos por N dão resto = 2, um por linha.
 */

import java.util.Scanner;

public class P1075 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for (int i = 1; i < 10000; i++)
			if (i % n == 2)
				System.out.println(i);
		
		in.close();
	}

}
