package beecrowd.iniciante;

/**
 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
 *
 * Entrada
 * A entrada contém um valor inteiro N (0 < N < 13).
 *
 * Saída
 * A saída contém um valor inteiro, correspondente ao fatorial de N.
 */

import java.util.Scanner;

public class P1153 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int tot = n;

        for (int i = 1; i < n; i++)
            tot *= (n-i);

        System.out.println(tot);

        in.close();
    }
}
