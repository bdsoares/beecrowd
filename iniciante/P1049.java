package beecrowd.iniciante;

/**
 * Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o
 * esquema, da esquerda para a direita.  Em seguida conclua qual dos animais seguintes foi
 * escolhido, através das três palavras fornecidas.
 *
 * Entrada
 * A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a
 * figura, com todas as letras minúsculas.
 *
 * Saída
 * Imprima o nome do animal correspondente à entrada fornecida.
 */

import java.util.Scanner;

public class P1049 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] inputs = new String[3];
		
		for (int i = 0; i < inputs.length; i++)
			inputs[i] = in.next();
		
		if (inputs[0].intern() == "vertebrado") {
			if (inputs[1].intern() == "ave") {
				if (inputs[2].intern() == "carnivoro" )
					System.out.println("aguia");
				else
					System.out.println("pomba");
			} else {
				if (inputs[2].intern() == "onivoro" )
					System.out.println("homem");
				else
					System.out.println("vaca");
			}
		} else {
			if (inputs[1].intern() == "inseto") {
				if (inputs[2].intern() == "hematofago" )
					System.out.println("pulga");
				else
					System.out.println("lagarta");
			} else {
				if (inputs[2].intern() == "hematofago" )
					System.out.println("sanguessuga");
				else
					System.out.println("minhoca");
			}
		}
		
		in.close();
	}

}
