package beecrowd.iniciante;

/**
 * Leia um valor X. Coloque este valor na primeira posição de um vetor N[100]. Em cada posição
 * subsequente de N (1 até 99), coloque a metade do valor armazenado na posição anterior, conforme
 * o exemplo abaixo. Imprima o vetor N.
 *
 * Entrada
 * A entrada contem um valor de dupla precisão com 4 casas decimais.
 *
 * Saída
 * Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor
 * armazenado naquela posição. Cada valor do vetor deve ser apresentado com 4 casas decimais.
 */

import java.util.Scanner;

public class P1178 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();

        for (int i = 0; i < 100; i++) {
            System.out.printf("N[%d] = %.4f\n", i, n);
            n /= 2;
        }

        in.close();
    }
}
