package beecrowd.iniciante;

/**
 * Leia um valor inteiro N que é o tamanho da matriz que deve ser impressa conforme o modelo
 * fornecido.
 *
 * Entrada
 * A entrada contém vários casos de teste e termina com EOF. Cada caso de teste é composto por
 * um único inteiro N (3 ≤ N < 70), que determina o tamanho (linhas e colunas) de uma matriz que
 * deve ser impressa.
 *
 * Saída
 * Para cada N lido, apresente a saída conforme o exemplo fornecido.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P1534 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        ArrayList<Integer> numbers = new ArrayList<>();
        String in;

        while ((in = br.readLine()) != null) // EOF
            numbers.add(Integer.parseInt(in));

        for (int n : numbers) {
            sb = new StringBuilder();
            int aux = 1;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    if (j == n - aux)
                        sb.append(2);
                    else if (i == j)
                        sb.append(1);
                    else
                        sb.append(3);

                sb.append("\n");
                aux++;
            }

            System.out.print(sb);
        }
    }
}
