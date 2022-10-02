package beecrowd.iniciante;

/**
 * Keanu estava testando novos modelos de tabuleiros de xadrez quanto teve a seguinte duvida:
 *
 * Quantas casas brancas e quantas casas pretas tem um tabuleiro de xadrez de tamanho nxn?
 *
 * Tabuleiro 3x3:
 * 5 casas brancas e 4 casas pretas
 *
 * Tabuleiro 4x4:
 * 8 casas brancas e 8 casas pretas
 *
 * Observe que a casa mais acima e mais à esquerda é sempre branca.
 *
 * Entrada
 * O input consiste de uma linha com um único inteiro n.
 *
 * 2 ≤ n ≤ 100
 *
 * Saída
 * Imprima "a casas brancas e b casas pretas" sem aspas, sendo a a quantidade de casas brancas e b a
 * quantidade de casas pretas.
 */

import java.util.Scanner;

public class P3342 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n = ler.nextInt();
		int casasBrancas=0;
		int casasPretas=0;
		
		for(int i = 1; i <= (n*n); i++) {
			if (i % 2 == 0) {
				casasPretas++;
			} else {
				casasBrancas++;
			}
		}
		
		System.out.println(casasBrancas + " casas brancas e " + casasPretas + " casas pretas");
		ler.close();
	}

}
