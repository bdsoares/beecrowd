package beecrowd.iniciante;

/**
 * Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para
 * organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano,
 * quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.
 *
 * Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas
 * informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia
 * utilizada e a quantidade de cobaias utilizadas em cada experimento.
 *
 * Entrada
 * A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a
 * seguir. Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade
 * de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia
 * (R:Rato S:Sapo C:Coelho).
 *
 * Saída
 * Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada
 * uma em relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado com dois
 * dígitos após o ponto.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Objects;

public class P1094 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(new Locale("en", "US"));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(in.readLine());
        String[] e = new String[t];
        int[] q = {0, 0, 0}; // 0 = Rato; 1 = Sapo; 2 = Coelho;
        int total = 0;

        for (int i = 0; i < e.length; i++) {
            //Scanner data = new Scanner(System.in);
            e[i] = in.readLine();
            String[] aux = e[i].split(" ");

            if (Objects.equals(aux[1], "R"))
                q[0] += Integer.parseInt(aux[0]);
            else if (Objects.equals(aux[1], "S"))
                q[1] += Integer.parseInt(aux[0]);
            else if (Objects.equals(aux[1], "C"))
                q[2] += Integer.parseInt(aux[0]);

            total += Integer.parseInt(aux[0]);
        }

        System.out.printf("Total: %d cobaias\n", total);
        System.out.printf("Total de coelhos: %d\n", q[2]);
        System.out.printf("Total de ratos: %d\n", q[0]);
        System.out.printf("Total de sapos: %d\n", q[1]);
        System.out.printf("Percentual de coelhos: %.2f %%\n", ((float)q[2]/total)*100);
        System.out.printf("Percentual de ratos: %.2f %%\n", ((float)q[0]/total)*100);
        System.out.printf("Percentual de sapos: %.2f %%\n", ((float)q[1]/total)*100);

        in.close();
    }
}
