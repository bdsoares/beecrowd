package beecrowd.iniciante;

/**
 * Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores
 * digitados foram ímpares, quantos valores digitados foram positivos e quantos valores digitados
 * foram negativos.
 *
 * Entrada
 * O arquivo de entrada contém 5 valores inteiros quaisquer.
 *
 * Saída
 * Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o
 * final de linha após cada uma.
 */

import java.util.Scanner;

public class P1066 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n[] = new int[5];
		int countPar = 0;
		int countImp = 0;
		int countPos = 0;
		int countNeg = 0;
		
		for (int i = 0; i < n.length; i++) {
			n[i] = in.nextInt();
			
			if (n[i] % 2 == 0)
				countPar++;
			else 
				countImp++;
			
			if (n[i] > 0)
				countPos++;
			else if (n[i] < 0)
				countNeg++;
		}
		
		System.out.println(countPar + " valor(es) par(es)");
		System.out.println(countImp + " valor(es) impar(es)");
		System.out.println(countPos + " valor(es) positivo(s)");
		System.out.println(countNeg + " valor(es) negativo(s)");
		
		in.close();
	}

}
