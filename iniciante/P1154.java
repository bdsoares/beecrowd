package beecrowd.iniciante;

/**
 * Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um
 * indivíduo. O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e
 * imprimir a idade média deste grupo de indivíduos.
 *
 * Entrada
 * A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor
 * negativo for lido.
 *
 * Saída
 * A saída contém um valor correspondente à média de idade dos indivíduos.
 *
 * A média deve ser impressa com dois dígitos após o ponto decimal.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class P1154 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int n;
        float result = 0;

        do {
            n = in.nextInt();

            if (n > 0)
                numbers.add(n);
        } while (n > 0);

        for (Integer number: numbers)
            result += number;

        System.out.printf("%.2f\n", (result/numbers.size()));

        in.close();
    }
}
