package beecrowd.iniciante;

/**
 * Na matemática, um Número Primo é aquele que pode ser dividido somente por 1 (um) e por ele
 * mesmo. Por exemplo, o número 7 é primo, pois pode ser dividido apenas pelo número 1 e pelo
 * número 7.
 *
 * Entrada
 * A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N (1 ≤ N ≤
 * 100), indicando o número de casos de teste da entrada. Cada uma das N linhas seguintes contém um
 * valor inteiro X (1 < X ≤ 107), que pode ser ou não, um número primo.
 *
 * Saída
 * Para cada caso de teste de entrada, imprima a mensagem “X eh primo” ou “X nao eh primo”, de
 * acordo com a especificação fornecida.
 */

import java.util.Scanner;

public class P1165 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        boolean[] isPrimo = new boolean[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
            isPrimo[i] = isPrimo(numbers[i]);
        }

        for (int i = 0; i < numbers.length; i++)
            System.out.printf("%d %s\n"
                    , numbers[i]
                    , isPrimo[i] ? "eh primo" : "nao eh primo"
                    );

        in.close();
    }

    public static boolean isPrimo(int n) {
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
