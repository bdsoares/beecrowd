package beecrowd.iniciante;

/**
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste
 * item. A seguir, calcule e mostre o valor da conta a pagar.
 *
 * Entrada
 * O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um
 * item conforme tabela acima.
 *
 * Saída
 * O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas
 * após o ponto decimal.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1038 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int codigo = ler.nextInt();
		int quantidade = ler.nextInt();

		switch (codigo) {
			case 1 -> System.out.println("Total: R$ " + df.format(quantidade * 4));
			case 2 -> System.out.println("Total: R$ " + df.format(quantidade * 4.5));
			case 3 -> System.out.println("Total: R$ " + df.format(quantidade * 5));
			case 4 -> System.out.println("Total: R$ " + df.format(quantidade * 2));
			case 5 -> System.out.println("Total: R$ " + df.format(quantidade * 1.5));
		}
		
		ler.close();
	}

}
