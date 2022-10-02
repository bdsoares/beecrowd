package beecrowd.iniciante;

/**
 * Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário.
 * A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
 * As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05
 * e 0.01. A seguir mostre a relação de notas necessárias.
 *
 * Entrada
 * O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
 *
 * Saída
 * Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme
 * exemplo fornecido.
 *
 * Obs: Utilize ponto (.) para separar a parte decimal.
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class P1021 {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double valor = ler.nextDouble();
		double[][] cedulas = {{100, 50, 20, 10, 5, 2}, {1, 0.50, 0.25, 0.10, 0.05, 0.01}};
		
		for(int x = 0; x < cedulas.length; x++) {
			if (x == 0)
				System.out.println("NOTAS:");
			else
				System.out.println("MOEDAS:");
			
			for(int y = 0; y < cedulas[x].length; y++) {
				int qtd = (int) (valor/cedulas[x][y]);
				valor -= qtd*cedulas[x][y];
				BigDecimal bd = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);
				valor = bd.doubleValue();
				
				if (x == 0)
					System.out.println(qtd + " nota(s) de R$ " + df.format(cedulas[x][y]));
				else
					System.out.println(qtd + " moeda(s) de R$ " + df.format(cedulas[x][y]));
			}
		}
		
		ler.close();
	}

}