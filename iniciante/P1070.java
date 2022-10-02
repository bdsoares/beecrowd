package beecrowd.iniciante;

/**
 * Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um
 * valor por linha, inclusive o X ser for o caso.
 *
 * Entrada
 * A entrada será um valor inteiro positivo.
 *
 * Saída
 * A saída será uma sequência de seis números ímpares.
 */

import java.util.Scanner;

public class P1070 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int count = 0;
		
		do {
			if (n % 2 != 0) {
				System.out.println(n);
				count++;
			}
			
			n++;
		} while(count < 6);
		
		
		in.close();
	}

}
