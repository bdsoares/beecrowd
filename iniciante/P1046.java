package beecrowd.iniciante;

import java.util.Scanner;

/**
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo
 * pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 *
 * Entrada
 * A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.
 *
 * Saída
 * Apresente a duração do jogo conforme exemplo abaixo.
 */

public class P1046 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int start = in.nextInt();
		int end = in.nextInt();
		
		if (start == end)
			System.out.println("O JOGO DUROU 24 HORA(S)");
		else if (start < end)
			System.out.println("O JOGO DUROU " + (end-start) + " HORA(S)");
		else 
			System.out.println("O JOGO DUROU " + (24-start+end) + " HORA(S)");
		
		in.close();
	}

}
