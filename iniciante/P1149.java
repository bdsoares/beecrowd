package beecrowd.iniciante;

/**
 * Faça um algoritmo para ler um valor A e um valor N. Imprimir a soma de A + i para cada i com os
 * valores (0 <= i <= N-1). Enquanto N for negativo ou ZERO, um novo N(apenas N) deve ser lido.
 *
 * Entrada
 * A entrada contém somente valores inteiros, podendo ser positivos ou negativos. Todos os valores
 * estão na mesma linha.
 *
 * Saída
 * A saída contém apenas um valor inteiro.
 */

import java.util.Scanner;

public class P1149 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n, tot = 0;

        do {
            n = in.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n; i++)
            tot += a+i;

        System.out.println(tot);

        in.close();
    }
}
