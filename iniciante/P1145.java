package beecrowd.iniciante;

/**
 * Escreva um programa que leia dois valores X e Y. A seguir, mostre uma sequência de 1 até Y,
 * passando para a próxima linha a cada X números.
 *
 * Entrada
 * O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e (X < Y < 100000).
 *
 * Saída
 * Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em branco entre cada número,
 * conforme exemplo abaixo. Não deve haver espaço em branco após o último valor da linha.
 */

import java.util.Scanner;

public class P1145 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();

        for (int i = 1, j = 1; i <= y; i++, j++)
            System.out.printf("%s", j % x != 0 ? i + " " : i + "\n");

        in.close();
    }
}
