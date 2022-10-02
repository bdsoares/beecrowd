package beecrowd.iniciante;

/**
 * Faça um programa que leia um valor N. Este N será o tamanho de um vetor X[N]. A seguir, leia cada
 * um dos valores de X, encontre o menor elemento deste vetor e a sua posição dentro do vetor,
 * mostrando esta informação.
 *
 * Entrada
 * A primeira linha de entrada contem um único inteiro N (1 < N < 1000), indicando o número de
 * elementos que deverão ser lidos em seguida para o vetor X[N] de inteiros. A segunda linha contém
 * cada um dos N valores, separados por um espaço. Vale lembrar que nenhuma entrada haverá números
 * repetidos.
 *
 * Saída
 * A primeira linha apresenta a mensagem “Menor valor:” seguida de um espaço e do menor valor lido
 * na entrada. A segunda linha apresenta a mensagem “Posicao:” seguido de um espaço e da posição do
 * vetor na qual se encontra o menor valor lido, lembrando que o vetor inicia na posição zero.
 */

import java.util.Scanner;

public class P1180 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] v = new int[n];
        int m, p;

        for (int i = 0; i < v.length; i++)
            v[i] = in.nextInt();

        m = v[0];
        p = 0;

        for (int i = 0; i < v.length; i++)
            if (v[i] < m) {
                m = v[i];
                p = i;
            }

        System.out.printf("Menor valor: %d\n", m);
        System.out.printf("Posicao: %d\n", p);

        in.close();
    }
}
