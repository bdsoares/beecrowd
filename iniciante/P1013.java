package beecrowd.iniciante;

/**
 * Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da
 * mensagem “eh o maior”.
 *
 * Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é
 * necessário para chegar no resultado esperado.
 *
 * Entrada
 * O arquivo de entrada contém três valores inteiros.
 *
 * Saída
 * Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 */

import java.util.Scanner;

public class P1013 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int A = ler.nextInt();
		int B = ler.nextInt();
		int C = ler.nextInt();
		
		int maiorAB = (A+B+Math.abs(A-B))/2;
		
		System.out.println((Math.max(maiorAB, C)) + " eh o maior");
		
		ler.close();
	}

}
