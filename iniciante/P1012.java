package beecrowd.iniciante;

/**
 * Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em
 * seguida, calcule e mostre:
 * a) a área do triângulo retângulo que tem A por base e C por altura.
 * b) a área do círculo de raio C. (pi = 3.14159)
 * c) a área do trapézio que tem A e B por bases e C por altura.
 * d) a área do quadrado que tem lado B.
 * e) a área do retângulo que tem lados A e B.
 * Entrada
 * O arquivo de entrada contém três valores com um dígito após o ponto decimal.
 *
 * Saída
 * O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas
 * acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor
 * calculado deve ser apresentado com 3 dígitos após o ponto decimal.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1012 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		
		double A = ler.nextDouble();
		double B = ler.nextDouble();
		double C = ler.nextDouble();
		
		System.out.println("TRIANGULO: " + df.format(((A*C)/2)));
		System.out.println("CIRCULO: " + df.format((Math.pow(C, 2)*3.14159)));
		System.out.println("TRAPEZIO: " + df.format(((A+B)*C)/2));
		System.out.println("QUADRADO: " + df.format(Math.pow(B, 2)));
		System.out.println("RETANGULO: " + df.format((A*B)));
		
		ler.close();
	}

}
