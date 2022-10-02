package beecrowd.iniciante;

/**
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso
 * de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada
 * para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor
 * tem peso 3 e o terceiro valor tem peso 5.
 *
 * Entrada
 * O arquivo de entrada contém um valor inteiro N na primeira linha. Cada N linha a seguir contém um
 * caso de teste com três valores com uma casa decimal cada valor.
 *
 * Saída
 * Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1079 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		int m = in.nextInt();
		double n[][] = new double[m][3];
		
		for (int x = 0; x < n.length; x++) 
			for (int y = 0; y < n[x].length; y++)
				n[x][y] = in.nextDouble();
		
		for (int x = 0; x < n.length; x++) {
			double result = 0;
			
			for (int y = 0; y < n[x].length; y++) {
				if (y == 0)
					result += n[x][y] * 0.2;
				else if (y == 1)
					result += n[x][y] * 0.3;
				else if (y == 2)
					result += n[x][y] * 0.5;
			}
			
			System.out.println(df.format(result));
		}
			
		
		in.close();
	}

}
