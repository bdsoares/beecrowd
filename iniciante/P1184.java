package beecrowd.iniciante;

/**
 * Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12].
 * Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão
 * abaixo da diagonal principal da matriz, conforme ilustrado abaixo (área verde).
 *
 * Entrada
 * A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação
 * (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto
 * flutuante que compõem a matriz.
 *
 * Saída
 * Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.
 */

import java.util.Scanner;

public class P1184 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float[][] m = new float[12][12];
        float result = 0;
        int count = 0;

        String op = in.next();

        for (int i = 0; i < 12; i++)
            for (int j = 0; j < 12; j++)
                m[i][j] = in.nextFloat();

        for (int i = 0; i < 12; i++)
            for (int j = 0; j < 12; j++)
                if (i > j) {
                    result += m[i][j];
                    count++;
                }

        if ("M".equals(op.toUpperCase())) result /= count;

        System.out.printf("%.1f\n", result);

        in.close();
    }
}
