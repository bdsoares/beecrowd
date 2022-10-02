package beecrowd.iniciante;

/**
 * Escreva um programa que leia um valor inteiro N (1 < N < 1000). Este N é a quantidade de linhas de
 * saída que serão apresentadas na execução do programa.
 *
 * Entrada
 * O arquivo de entrada contém um número inteiro positivo N.
 *
 * Saída
 * Imprima a saída conforme o exemplo fornecido.
 */

import java.util.Scanner;

public class P1143 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1, j = 0; i <= n || j < 3; i++,j++)
            System.out.printf("%.0f %.0f %.0f\n", Math.pow(i, 1), Math.pow(i, 2), Math.pow(i, 3));

        in.close();
    }
}
