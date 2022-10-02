package beecrowd.iniciante;

/**
 * Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os valores nulos e negativos do
 * vetor X por 1. Em seguida mostre o vetor X.
 *
 * Entrada
 * A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.
 *
 * Saída
 * Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do vetor e x é o valor armazenado
 * naquela posição.
 */

import java.util.Scanner;

public class P1172 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vet = new int[10];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = in.nextInt();
            vet[i] = vet[i] <= 0 ? vet[i] = 1 : vet[i];
        }

        for (int i = 0; i < vet.length; i++)
            System.out.printf("X[%d] = %d\n", i, vet[i]);

        in.close();
    }
}
