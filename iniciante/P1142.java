package beecrowd.iniciante;

/**
 * Escreva um programa que leia um valor inteiro N. Este N é a quantidade de linhas de saída que serão
 * apresentadas na execução do programa.
 *
 * Entrada
 * O arquivo de entrada contém um número inteiro positivo N.
 *
 * Saída
 * Imprima a saída conforme o exemplo fornecido.
 */

import java.util.Scanner;

public class P1142 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1, j = 0; i <= n*4 || j <= 4; i++, j++)
            System.out.printf("%s", i % 4 == 0 ? "PUM\n" : i + " ");

        in.close();
    }
}
