package beecrowd.iniciante;

/**
 * Pedrinho está organizando um evento em sua Universidade. O evento deverá ser no mês de Abril,
 * iniciando e terminando dentro do mês. O problema é que Pedrinho quer calcular o tempo que o
 * evento vai durar, uma vez que ele sabe quando inicia e quando termina o evento.
 *
 * Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar Pedrinho a
 * calcular a duração deste evento.
 *
 * Entrada
 * Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um espaço e o dia do mês no
 * qual o evento vai começar. Na linha seguinte, será informado o momento no qual o evento vai iniciar,
 * no formato hh : mm : ss. Na terceira e quarta linha de entrada haverá outra informação no mesmo
 * formato das duas primeiras linhas, indicando o término do evento.
 *
 * Saída
 * Na saída, deve ser apresentada a duração do evento, no seguinte formato:
 *
 * W dia(s)
 * X hora(s)
 * Y minuto(s)
 * Z segundo(s)
 *
 * Obs: Considere que o evento do caso de teste para o problema tem duração mínima de 1 minuto.
 */

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class P1061 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String[][] entradas = new String[2][2];
		ArrayList<Integer> time = new ArrayList<Integer>();
		String[][] secondsConvert = {{"86400", "3600", "60", "1"}
									,{" dia(s)", " hora(s)", " minuto(s)", " segundo(s)"}};
				
		for (int x = 0; x < entradas.length; x++)
			for (int y = 0; y < entradas[x].length; y++)
				entradas[x][y] = ler.nextLine();		// Entrada de dados.
		
		int dayStart = Integer.parseInt(entradas[0][0].split(" ")[1]); // Pegar apenas os números das entradas dias.
		int dayEnd = Integer.parseInt(entradas[1][0].split(" ")[1]);
		
		for (String s : entradas[0][1].split(" : ")) // Pegar os números do tempo.
			time.add(Integer.parseInt(s));
		
		for (String s : entradas[1][1].split(" : ")) 
			time.add(Integer.parseInt(s));
		
		LocalDateTime start = LocalDateTime.of(2022, 04, dayStart, time.get(0), time.get(1), time.get(2)); // Monta as datas.
		LocalDateTime end = LocalDateTime.of(2022, 04, dayEnd, time.get(3), time.get(4), time.get(5));
		
		int seconds = (int) start.until(end, ChronoUnit.SECONDS); // Calcula diferença das datas em segundos.
		
		for (int x = 0; x < secondsConvert[0].length; x++) {			// Saída dos valores processados.
			int n = (int) seconds/Integer.parseInt(secondsConvert[0][x]);
			seconds -= n*Integer.parseInt(secondsConvert[0][x]);
			
			System.out.println(n + secondsConvert[1][x]);
		}
		
		ler.close();
	}

}
