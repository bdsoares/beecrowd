package beecrowd.iniciante;

/**
 * Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste
 * consiste de dois inteiros X e Y. Você deve apresentar a soma de Y ímpares consecutivos a partir de X
 * inclusive o próprio X se ele for ímpar. Por exemplo:
 * para a entrada 4 5, a saída deve ser 45, que é equivalente à: 5 + 7 + 9 + 11 + 13
 * para a entrada 7 4, a saída deve ser 40, que é equivalente à: 7 + 9 + 11 + 13
 *
 * Entrada
 * A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir.
 * Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.
 *
 * Saída
 * Imprima a soma dos consecutivos números ímpares a partir do valor X.
 */

import java.util.Scanner;

public class P1158 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] inputs = new int[n][2];
        int sum = 0;

        for (int i = 0; i < inputs.length; i++)
            for (int j = 0; j < inputs[i].length; j++)
                inputs[i][j] = in.nextInt();

        for (int[] input : inputs) {
            int count = 0;

            for (int j = input[0]; count < input[1]; j++) {
                if (j % 2 != 0) {
                    sum += j;
                    count++;
                }
            }

            System.out.println(sum);
            sum = 0;
        }

        in.close();
    }
}
