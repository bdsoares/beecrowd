package beecrowd.iniciante;

/**
 * Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima
 * linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto
 * decimal.
 *
 * Entrada
 * A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. Pelo menos um
 * destes números será positivo.
 *
 * Saída
 * O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média
 * dos valores positivos digitados.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1064 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		double n[] = new double[6];
		double positives = 0;
		int count = 0;
		int isPositive = 0;
		
		do {
			n[count] = in.nextDouble();
			if (n[count] >= 0) {
				isPositive++;
				positives += n[count];
			}
			
			count++;
		} while (count < n.length);
		
		System.out.println(isPositive + " valores positivos");
		System.out.println(df.format(positives/isPositive));
		
		in.close();
	}

}
