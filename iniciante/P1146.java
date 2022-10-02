package beecrowd.iniciante;

/**
 * Este programa deve ler uma variável inteira X inúmeras vezes (deve parar quando o valor no arquivo
 * de entrada for igual a zero). Para cada valor lido imprima a sequência de 1 até X, com um espaço entre
 * cada número e seu sucessor.
 *
 * Obs: cuide para não deixar espaço em branco após o último valor apresentado na linha ou você receberá
 * Presentation Error.
 *
 * Entrada
 * O arquivo de entrada contém vários números inteiros. O último número no arquivo de entrada é 0.
 *
 * Saída
 * Para cada número N do arquivo de entrada deve ser impressa uma linha de 1 até N, conforme o exemplo
 * abaixo. Não deve haver espaço em branco após o último valor da linha.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class P1146 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int input;

        do {
            input = in.nextInt();

            if (input != 0)
                numbers.add(input);
        } while (input != 0);

        for (Integer number : numbers) {
            StringBuilder out = new StringBuilder();

            for (int j = 1; j <= number; j++)
                out.append(j != number ? j + " " : j + "");

            System.out.println(out);
        }

        in.close();
    }
}
