package beecrowd.iniciante;

/**
 * Escreva um programa que leia um valor inteiro N. N * 2 linhas de saída serão apresentadas na
 * execução do programa, seguindo a lógica do exemplo abaixo. Para valores com mais de 6 dígitos,
 * todos os dígitos devem ser apresentados.
 *
 * Entrada
 * O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).
 *
 * Saída
 * Imprima a saída conforme o exemplo fornecido.
 */

import java.util.Scanner;

public class P1144 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i <= n; i++)
            for (int j = 0; j < 2; j++)
                System.out.printf("%.0f %.0f %.0f\n"
                        , Math.pow(i, 1)
                        , j == 0 ? Math.pow(i, 2) : Math.pow(i, 2)+1
                        , j == 0 ? Math.pow(i, 3) : Math.pow(i, 3)+1
                );

        in.close();
    }
}
