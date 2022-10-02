package beecrowd.iniciante;

/**
 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada
 * peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e
 * mostre o valor a ser pago.
 *
 * Entrada
 * O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente
 * dois inteiros e um valor com 2 casas decimais.
 *
 * Saída
 * A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um
 * espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas
 * após o ponto.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1010 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double[][] pecas = new double[2][3];
		double total = 0;
		
		for(int x = 0; x < pecas.length; x++) {
			for (int y = 0; y < pecas[x].length; y++) {
				pecas[x][y] = ler.nextDouble();
			}
			total += pecas[x][1] * pecas[x][2];
		}
		
		System.out.println("VALOR A PAGAR: R$ " + df.format(total));
		
		ler.close();
	}

}
