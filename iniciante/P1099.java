package beecrowd.iniciante;

/**
 * Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste
 * consiste de dois inteiros X e Y. Você deve apresentar a soma de todos os ímpares existentes entre X
 * e Y.
 *
 * Entrada
 * A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir.
 * Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.
 *
 * Saída
 * Imprima a soma de todos valores ímpares entre X e Y.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1099 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        String[] e = new String[n];

        for (int i = 0; i < e.length; i++)
            e[i] = in.readLine();

        for (String s : e) {
            String[] aux = s.split(" ");

            int i = Integer.parseInt(aux[0]);
            int j = Integer.parseInt(aux[1]);

            int x = Math.min(i, j);
            int y = Math.max(i, j);

            int sum = 0;

            for (int z = x+1; z < y; z++)
                if (z % 2 != 0)
                    sum += z;

            System.out.println(sum);
        }

        in.close();
    }
}
