package beecrowd.iniciante;

/**
 * Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B
 * pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 *
 * Entrada
 * O arquivo de entrada contém 4 valores inteiros.
 *
 * Saída
 * Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com
 * um espaço em branco antes e depois da igualdade.
 */

import java.util.Scanner;

public class P1007 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int A = ler.nextInt();
		int B = ler.nextInt();
		int C = ler.nextInt();
		int D = ler.nextInt();
		
		int dif = (A * B - C * D);
		
		System.out.println("DIFERENCA = " + dif);
		ler.close();
	}

}
