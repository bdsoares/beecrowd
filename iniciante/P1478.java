package beecrowd.iniciante;

/**
 * Escreva um algoritmo que leia um inteiro N (0 ≤ N ≤ 100), correspondente a ordem de uma matriz M
 * de inteiros, e construa a matriz de acordo com o exemplo abaixo.
 *
 * Entrada
 * A entrada consiste de vários inteiros, um valor por linha, correspondentes as ordens das matrizes a
 * serem construídas. O final da entrada é marcado por um valor de ordem igual a zero (0).
 *
 * Saída
 * Para cada inteiro da entrada imprima a matriz correspondente, de acordo com o exemplo. (os valores
 * das matrizes devem ser formatados em um campo de tamanho 3 justificados à direita e separados por
 * espaço. Após o último caractere de cada linha da matriz não deve haver espaços em branco. Após a
 * impressão de cada matriz deve ser deixada uma linha em branco.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class P1478 {
    public static void main(String[] args) {
        StringBuilder sb;
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int input;

        do {
            input = in.nextInt();

            if (input > 0)
                numbers.add(input);
        } while (input > 0);

        for (int n : numbers) {
            sb = new StringBuilder();

            for (int i = 0; i < n; i++) {
                int aum = 1;
                int dec = i+2;

                for (int j = 0; j < n; j++) {
                    if (i == j)
                        sb.append(String.format("%3d", 1));
                    else if (j < i)
                        sb.append(String.format("%3d", --dec));
                    else
                        sb.append(String.format("%3d", ++aum));

                    if (j != n - 1)
                        sb.append(" ");
                }
                sb.append("\n");
            }

            System.out.println(sb);
        }

        in.close();
    }
}
