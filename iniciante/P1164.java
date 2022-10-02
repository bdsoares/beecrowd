package beecrowd.iniciante;

/**
 * Na matemática, um número perfeito é um número inteiro para o qual a soma de todos os seus
 * divisores positivos próprios (excluindo ele mesmo) é igual ao próprio número. Por exemplo
 * o número 6 é perfeito, pois 1+2+3 é igual a 6. Sua tarefa é escrever um programa que imprima
 * se um determinado número é perfeito ou não.
 *
 * Entrada
 * A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 20),
 * indicando o número de casos de teste da entrada. Cada uma das N linhas seguintes contém um valor
 * inteiro X (1 ≤ X ≤ 108), que pode ser ou não, um número perfeito.
 *
 * Saída
 * Para cada caso de teste de entrada, imprima a mensagem “X eh perfeito” ou “X nao eh perfeito”, de
 * acordo com a especificação fornecida.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class P1164 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        ArrayList<Integer> divisores = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = in.nextInt();

        for (int number : numbers) {
            int sum = 0;

            for (int i = 1; i < number; i++)
                if (number % i == 0)
                    divisores.add(i);

            for (int divisor : divisores)
                sum += divisor;

            if (number == sum)
                System.out.printf("%d eh perfeito\n", number);
            else
                System.out.printf("%d nao eh perfeito\n", number);

            divisores.clear();
        }

        in.close();
    }
}
