package beecrowd.iniciante;

/**
 * Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor
 * pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor
 * lido e a relação de notas necessárias.
 *
 * Entrada
 * O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
 *
 * Saída
 * Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme
 * o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu
 * programa apresentará a mensagem: “Presentation Error”.
 */

import java.util.Locale;
import java.util.Scanner;

public class P1018 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Locale localeBr = new Locale("pt", "BR");
		
		int valor = ler.nextInt();
		int[] cedulas = {100, 50, 20, 10, 5, 2, 1};
		
		System.out.println(valor);

		for (int cedula : cedulas) {
			int qtd = valor / cedula;
			valor -= qtd * cedula;

			System.out.format(localeBr, "%d nota(s) de R$ %,.2f\n", qtd, (double) cedula);
		}
		
		ler.close();
	}

}
