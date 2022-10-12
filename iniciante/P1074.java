package beecrowd.iniciante;

/**
 * Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. Para cada
 * valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD),
 * positivo (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0), embora a descrição
 * correta seja (EVEN NULL), pois por definição zero é par, seu programa deverá imprimir apenas NULL.
 *
 * Entrada
 * A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos de teste.
 * Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 *
 * Saída
 * Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as letras
 * deverão ser maiúsculas e sempre deverá haver um espaço entre duas palavras impressas na mesma linha.
 */

import java.util.Scanner;

public class P1074 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] list = new int[n];
		
		for (int i = 0; i < list.length; i++)
			list[i] = in.nextInt();

		for (int j : list) {
			if (j == 0) {
				System.out.println("NULL");
				continue;
			}

			if (j % 2 == 0)
				System.out.print("EVEN ");
			else
				System.out.print("ODD ");

			if (j < 0)
				System.out.println("NEGATIVE");
			else
				System.out.println("POSITIVE");
		}
		
		in.close();
	}

}
