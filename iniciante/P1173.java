package beecrowd.iniciante;

/**
 * Leia um valor e faça um programa que coloque o valor lido na primeira posição de um vetor N[10]. Em
 * cada posição subsequente, coloque o dobro do valor da posição anterior. Por exemplo, se o valor lido
 * for 1, os valores do vetor devem ser 1,2,4,8 e assim sucessivamente. Mostre o vetor em seguida.
 *
 * Entrada
 * A entrada contém um valor inteiro (V<=50).
 *
 * Saída
 * Para cada posição do vetor, escreva "N[i] = X", onde i é a posição do vetor e X é o valor armazenado na
 * posição i. O primeiro número do vetor N (N[0]) irá receber o valor de V.
 */

import java.util.Scanner;

public class P1173 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[10];

        numbers[0] = n;
        System.out.println("N[0] = " + numbers[0]);

        for (int i = 1; i < 10; i++) {
            numbers[i] = numbers[i-1]*2;
            System.out.printf("N[%d] = %d\n", i, numbers[i]);
        }

        in.close();
    }
}
