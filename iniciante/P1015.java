package beecrowd.iniciante;

/**
 * Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e
 * p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula.
 *
 * Entrada
 * O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto
 * flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.
 *
 * Saída
 * Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1015 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0000");
		
		double p[][] = new double[2][2];
		
		for (int x = 0; x < p.length; x++) {
			for(int y = 0; y < p[x].length; y++) {
				p[x][y] = ler.nextDouble();
			}
		}
		
		System.out.println(df.format(Math.sqrt(
				Math.pow(p[1][0]-p[0][0], 2) + Math.pow(p[0][1]-p[1][1], 2))));
		
		ler.close();
	}

}
