package beecrowd.iniciante;

/**
 * Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores for
 * menor ou igual a zero). Para cada par lido, mostre a sequência do menor até o maior e a soma dos
 * inteiros consecutivos entre eles (incluindo o N e M).
 *
 * Entrada
 * O arquivo de entrada contém um número não determinado de valores M e N. A última linha de
 * entrada vai conter um número nulo ou negativo.
 *
 * Saída
 * Para cada dupla de valores, imprima a sequência do menor até o maior e a soma deles, conforme
 * exemplo abaixo.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class P1101 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int x, y;
        ArrayList<ArrayList<Integer>> values = new ArrayList<>();

        do {
            int n1 = in.nextInt(), n2 = in.nextInt();

            x = Math.min(n1, n2);
            y = Math.max(n1, n2);

            ArrayList<Integer> aux = new ArrayList<>();
            aux.add(x);
            aux.add(y);

            values.add(aux);
        } while (x > 0 && y > 0);

        for (ArrayList<Integer> value : values) {
            int m = value.get(0);
            int n = value.get(1);
            int sum = 0;

            if (m <= 0 || n <= 0) break;

            for (int j = m; j <= n; j++) {
                System.out.print(j + " ");
                sum+=j;
            }
            System.out.println("Sum=" + sum);
        }

        in.close();
    }
}
