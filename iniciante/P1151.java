package beecrowd.iniciante;

/**
 * A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci. Nessa
 * sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. Escreva um
 * algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.
 *
 * Entrada
 * O arquivo de entrada contém um valor inteiro N (0 < N < 46).
 *
 * Saída
 * Os valores devem ser mostrados na mesma linha, separados por um espaço em branco. Não deve
 * haver espaço após o último valor.
 */

import java.util.Scanner;

public class P1151 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        int n = in.nextInt();

        for (int i = 0; i < n; i++)
            out.append(i != n-1 ? valueFibo(i) + " " : valueFibo(i));

        System.out.println(out);

        in.close();
    }

    public static int valueFibo(int i) {
        return i < 2 ? i : valueFibo(i - 1) + valueFibo(i - 2);
    }
}
