package beecrowd.iniciante;

/**
 * Leia um número inteiro que representa um código de DDD para discagem interurbana. Em seguida,
 * informe à qual cidade o DDD pertence.
 *
 * Se a entrada for qualquer outro DDD que não esteja presente na tabela, o programa deverá
 * informar:
 * DDD nao cadastrado
 *
 * Entrada
 * A entrada consiste de um único valor inteiro.
 *
 * Saída
 * Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao
 * cadastrado caso não existir DDD correspondente ao número digitado.
 */

import java.util.Scanner;

public class P1050 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int ddd = in.nextInt();

		switch (ddd) {
			case 61 -> System.out.println("Brasilia");
			case 71 -> System.out.println("Salvador");
			case 11 -> System.out.println("Sao Paulo");
			case 21 -> System.out.println("Rio de Janeiro");
			case 32 -> System.out.println("Juiz de Fora");
			case 19 -> System.out.println("Campinas");
			case 27 -> System.out.println("Vitoria");
			case 31 -> System.out.println("Belo Horizonte");
			default -> System.out.println("DDD nao cadastrado");
		}
		
		in.close();
	}

}
