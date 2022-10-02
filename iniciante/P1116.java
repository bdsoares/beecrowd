package beecrowd.iniciante;

/**
 * Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo.
 * Caso não for possível mostre a mensagem “divisao impossivel” para os valores em questão.
 *
 * Entrada
 * A entrada contém um número inteiro N. Este N será a quantidade de pares de valores inteiros (X e Y)
 * que serão lidos em seguida.
 *
 * Saída
 * Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, ou “divisao
 * impossivel” caso não seja possível efetuar o cálculo.
 *
 * Obs.: Cuide que a divisão entre dois inteiros em algumas linguagens como o C e C++ gera outro
 * inteiro. Utilize cast :)
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1116 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        int n = in.nextInt();
        int[][] m = new int[n][2];

        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = in.nextInt();

        for (int[] ints : m) {
            try {
                float result = (float) ints[0] / ints[1];

                if (result == Float.POSITIVE_INFINITY ||
                        result == Float.NEGATIVE_INFINITY)
                    throw new ArithmeticException();

                System.out.println(df.format(result));
            } catch (ArithmeticException ex) {
                System.out.println("divisao impossivel");
            }
        }

        in.close();
    }
}
