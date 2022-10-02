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
 * Para cada inteiro da entrada imprima a matriz correspondente, de acordo com o exemplo. Os valores
 * das matrizes devem ser formatados em um campo de tamanho 3 justificados à direita e separados por
 * espaço. Após o último caractere de cada linha da matriz não deve haver espaços em branco. Após a
 * impressão de cada matriz deve ser deixada uma linha em branco.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class P1435 {
    public static void main(String[] args) {
        StringBuilder sb;
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int input;

        do {
            input = in.nextInt();
            if (input > 0)
                numbers.add(input); // Entrada dos valores (tamanho das matrizes).
        } while (input > 0);

        for (int n : numbers) {
            sb = new StringBuilder();
            int[][] m = new int[n][n]; // Criar matriz de acordo com o tamanho informado.
            int count = 0;
            int aux = n;

            do { // Prencher os valores da matriz.
                for (int i = count; i < aux; i++) {
                    for (int j = count; j < aux; j++) {
                        m[i][j] = count+1;
                    }
                }
                count ++;
                aux --;
                /*
                    A Matriz é preenchida completamente por count+1.
                    Na próxima execução do while, apenas a parte interior é preenchida com count+1
                    E assim é executado até que o valor de count ultrapasse o valor de n
                    Dessa forma é possível preencher os valores como se fosse uma matriz dentro de outra.
                 */
            } while (count < aux);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sb.append(String.format("%3d", m[i][j]));
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
