package beecrowd.iniciante;

/**
 * Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem
 * crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.
 *
 * Entrada
 * A entrada contem três números inteiros.
 *
 * Saída
 * Imprima a saída conforme foi especificado.
 */

import java.util.Arrays;
import java.util.Scanner;

public class P1042 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int[] n = new int[3];
		int[] m = new int[3];
		
		for (int i = 0; i < n.length; i++) {
			n[i] = ler.nextInt();
			m[i] = n[i];
		}
		
		Arrays.sort(n);
		
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}
		
		ler.close();
	}

}
