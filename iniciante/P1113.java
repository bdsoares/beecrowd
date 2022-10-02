package beecrowd.iniciante;

/**
 * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma
 * mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente.
 *
 * Entrada
 * A entrada contém vários casos de teste. Cada caso contém dois valores inteiros X e Y. A leitura deve
 * ser encerrada ao ser fornecido valores iguais para X e Y.
 *
 * Saída
 * Para cada caso de teste imprima “Crescente”, caso os valores tenham sido digitados na ordem
 * crescente, caso contrário imprima a mensagem “Decrescente”.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class P1113 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> n = new ArrayList<>();
        int x, y;

        do {
            x = in.nextInt();
            y = in.nextInt();

            if (x != y) {
                ArrayList<Integer> m = new ArrayList<>();
                m.add(x);
                m.add(y);
                n.add(m);
            }
        } while (x != y);

        for (ArrayList<Integer> value : n) {
            x = value.get(0);
            y = value.get(1);

            if (x < y)
                System.out.println("Crescente");
            else
                System.out.println("Decrescente");
        }

        in.close();
    }
}
