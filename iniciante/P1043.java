package beecrowd.iniciante;

/**
 * Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo,
 * calcule o perímetro do triângulo e apresente a mensagem:
 *
 * Perimetro = XX.X
 *
 * Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a
 * mensagem
 *
 * Area = XX.X
 *
 * Entrada
 * A entrada contém três valores reais.
 *
 * Saída
 * O resultado deve ser apresentado com uma casa decimal.
 */

import java.util.Scanner;

public class P1043 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n[] = new double[3];
		
		for (int i = 0; i < n.length; i++)
			n[i] = ler.nextDouble();
		
		for (int x = 0; x < n.length; x++) // Ordenar os valores recebidos.
			for (int y = 0; y < x; y++)
				if (n[x] > n[y]) {
					double aux = n[x];
					n[x] = n[y];
					n[y] = aux;
				}
		
		if (n[0] >= (n[1]+n[2]))
			System.out.println("Area = " + ((n[0] + n[1]) * n[2])/2);
		else
			System.out.println("Perimetro = " + (n[0] + n[1] + n[2]));
		
		ler.close();
	}

}
