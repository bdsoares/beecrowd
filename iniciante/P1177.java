package beecrowd.iniciante;

/**
 * Faça um programa que leia um valor T e preencha um vetor N[1000] com a sequência de valores de 0
 * até T-1 repetidas vezes, conforme exemplo abaixo. Imprima o vetor N.
 *
 * Entrada
 * A entrada contém um valor inteiro T (2 ≤ T ≤ 50).
 *
 * Saída
 * Para cada posição do vetor, escreva "N[i] = x", onde i é a posição do vetor e x é o valor armazenado
 * naquela posição.
 */

import java.util.Scanner;

public class P1177 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 0;

        for (int i = 0; i < 1000; i++) {
            System.out.printf("N[%d] = %d\n", i , m);
            m = m < n-1 ? m+1 : 0;
        }

        in.close();
    }
}
