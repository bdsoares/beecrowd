package beecrowd.iniciante;

/**
 * Faça um programa que leia um vetor A[100]. No final, mostre todas as posições do vetor que
 * armazenam um valor menor ou igual a 10 e o valor armazenado em cada uma das posições.
 *
 * Entrada
 * A entrada contém 100 valores, podendo ser inteiros, reais, positivos ou negativos.
 *
 * Saída
 * Para cada valor do vetor menor ou igual a 10, escreva "A[i] = x", onde i é a posição do vetor
 * e x é o valor armazenado na posição, com uma casa após o ponto decimal.
 */

import java.util.Scanner;

public class P1174 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float[] a = new float[100];

        for (int i = 0; i < a.length; i++)
            a[i] = in.nextFloat();

        for (int i = 0; i < a.length; i++)
            if (a[i] <= 10)
                System.out.printf("A[%d] = %.1f\n", i, a[i]);

        in.close();
    }
}
