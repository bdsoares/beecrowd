package beecrowd.iniciante;

/**
 * Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e
 * mostre esta informação.
 *
 * Entrada
 * O arquivo de entrada contém 5 valores inteiros quaisquer.
 *
 * Saída
 * Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.
 */

import java.util.Scanner;

public class P1065 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n[] = new int[5];
		int count = 0;
		
		for (int i = 0; i < n.length; i++) {
			n[i] = in.nextInt();
			
			if (n[i] % 2 == 0)
				count++;
		}
		
		System.out.println(count + " valores pares");
		
		in.close();
	}

}
