package beecrowd.iniciante;

/**
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo,
 * mostrando essas informações.
 *
 * Entrada
 * A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de
 * teste.
 * Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 *
 * Saída
 * Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do
 * intervalo.
 */

import java.util.Scanner;

public class P1072 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m[] = new int[n];
		int r[] = new int[2];
		
		for (int i = 0; i < n; i++) {
			m[i] = in.nextInt();
			
			if (m[i] >= 10 && m[i] <= 20)
				r[0]++;
			else
				r[1]++;
		}
		
		System.out.println(r[0] + " in");
		System.out.println(r[1] + " out");
		
		in.close();
	}

}
