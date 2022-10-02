package beecrowd.iniciante;

/**
 * Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do
 * jogo.
 *
 * Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.
 *
 * Entrada
 * Quatro números inteiros representando a hora de início e fim do jogo.
 *
 * Saída
 * Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .
 */

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class P1047 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[][] time = new int[2][2];
		
		for (int x = 0; x < time.length; x++)
			for (int y = 0; y < time[x].length; y++)
				time[x][y] = in.nextInt();
		
		int day = time[0][0] < time[1][0] || (time[0][0] == time[1][0] && time[0][1] < time[1][1]) ? 1 : 2;
		
		LocalDateTime start = LocalDateTime.of(2022, 01, 01, time[0][0], time[0][1], 0); // Monta as datas.
		LocalDateTime end = LocalDateTime.of(2022, 01, day, time[1][0], time[1][1], 0);
		
		int minutes = (int) start.until(end, ChronoUnit.MINUTES); // Calcula diferença das datas em minutos.

		if (minutes == 0)
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		else {
			int hour = minutes/60;
			minutes -= hour*60;
			
			System.out.println("O JOGO DUROU " + hour + " HORA(S) E " + minutes + " MINUTO(S)");
		}
		
		in.close();
	}

}
