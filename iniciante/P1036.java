package beecrowd.iniciante;

/**
 * Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for
 * possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma
 * divisão por 0 ou raiz de numero negativo.
 *
 * Entrada
 * Leia três valores de ponto flutuante (double) A, B e C.
 *
 * Saída
 * Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso
 * contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem
 * correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1036 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00000");

		double A = ler.nextDouble();
		double B = ler.nextDouble();
		double C = ler.nextDouble();
		
		double delta = (Math.pow(B, 2) -4*A*C);

		double R1 = (-B + Math.sqrt(delta)) / (2 * A);
		double R2 = (-B - Math.sqrt(delta)) / (2 * A);

		if (!Double.isNaN(R1) && !Double.isNaN(R2)) {
			System.out.println("R1 = " + df.format(R1));
			System.out.println("R2 = " + df.format(R2));
		} 
		else
			System.out.println("Impossivel calcular");
		
		ler.close();
	}

}
