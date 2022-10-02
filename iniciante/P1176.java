package beecrowd.iniciante;

/**
 * Faça um programa que leia um valor e apresente o número de Fibonacci correspondente a este valor
 * lido. Lembre que os 2 primeiros elementos da série de Fibonacci são 0 e 1 e cada próximo termo é a
 * soma dos 2 anteriores a ele. Todos os valores de Fibonacci calculados neste problema devem caber
 * em um inteiro de 64 bits sem sinal.
 *
 * Entrada
 * A primeira linha da entrada contém um inteiro T, indicando o número de casos de teste. Cada caso de
 * teste contém um único inteiro N (0 ≤ N ≤ 60), correspondente ao N-esimo termo da série de Fibonacci.
 *
 * Saída
 * Para cada caso de teste da entrada, imprima a mensagem "Fib(N) = X", onde X é o N-ésimo termo da
 * série de Fibonacci.
 */

import java.util.Scanner;

public class P1176 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int input = in.nextInt();

            sb.append("Fib(").append(input).append(") = ").append(fibo(input)).append("\n");
        }

        System.out.print(sb);
        in.close();
    }

    public static Long fibo(int n) {
        long a = 0L, b = 1L, c = 0L;

        if (n == 1) return b;

        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }
}
