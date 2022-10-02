package beecrowd.iniciante;

/**
 * Escreva um algoritmo que leia um inteiro N (0 ≤ N ≤ 15), correspondente a ordem de uma matriz M de
 * inteiros, e construa a matriz de acordo com o exemplo abaixo.
 *
 * Entrada
 * A entrada consiste de vários inteiros, um valor por linha, correspondentes as ordens das matrizes a
 * serem construídas. O final da entrada é marcado por um valor de ordem igual a zero (0).
 *
 * Saída
 * Para cada inteiro da entrada imprima a matriz correspondente, de acordo com o exemplo. Os valores
 * das matrizes devem ser formatados em um campo de tamanho T justificados à direita e separados
 * por espaço, onde T é igual ao número de dígitos do maior número da matriz. Após o último caractere
 * de cada linha da matriz não deve haver espaços em branco. Após a impressão de cada matriz deve ser
 * deixada uma linha em branco.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class P1557 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> test = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int input;

        do {
            input = in.nextInt();

            if (input > 0)
                numbers.add(input);
        } while(input > 0);

        for (int n : numbers) {
            int aux = 1;
            for (int i = 1; i <= n; i++) {
                int auxLine = aux*2;
                for (int j = 1; j <= n; j++) {
                    test.add(aux);
                    aux *= 2;
                }
                aux = auxLine;
            }
            System.out.println(processData(test, n, sb));
            sb = new StringBuilder();
            test = new ArrayList<>();
        }

        in.close();
    }

    public static StringBuilder processData(ArrayList<Integer> inputs, int line, StringBuilder sb) {
        int maxNumber = Integer.toString(inputs.get(inputs.size()-1)).length();
        int count = 0;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line; j++) {
                sb.append(String.format("%" + (j == 0 ? maxNumber : maxNumber+1) + "s", inputs.get(count)));
                count++;
            }
            sb.append("\n");
        }

        return sb;
    }
}
