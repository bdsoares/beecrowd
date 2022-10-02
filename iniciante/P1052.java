package beecrowd.iniciante;

/**
 * Leia um valor inteiro entre 1 e 12, inclusive. Correspondente a este valor, deve ser apresentado como
 * resposta o mês do ano por extenso, em inglês, com a primeira letra maiúscula.
 *
 * Entrada
 * A entrada contém um único valor inteiro.
 *
 * Saída
 * Imprima por extenso o nome do mês correspondente ao número existente na entrada, com a primeira
 * letra em maiúscula.
 */

import java.util.Scanner;

public class P1052 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int month = in.nextInt();

		switch (month) {
			case 1 -> System.out.println("January");
			case 2 -> System.out.println("February");
			case 3 -> System.out.println("March");
			case 4 -> System.out.println("April");
			case 5 -> System.out.println("May");
			case 6 -> System.out.println("June");
			case 7 -> System.out.println("July");
			case 8 -> System.out.println("August");
			case 9 -> System.out.println("September");
			case 10 -> System.out.println("October");
			case 11 -> System.out.println("November");
			case 12 -> System.out.println("December");
		}
		
		in.close();
	}

}
