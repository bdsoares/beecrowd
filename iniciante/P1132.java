package beecrowd.iniciante;

/**
 * Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números que não são
 * múltiplos de 13 entre X e Y, incluindo ambos.
 *
 * Entrada
 * O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente em ordem crescente.
 *
 * Saída
 * Imprima a soma de todos os valores não divisíveis por 13 entre os dois valores lidos na entrada,
 * inclusive ambos se for o caso.
 */

import java.util.Scanner;

public class P1132 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        int soma = 0;

        if (x > y) {
            int z = x;
            x = y;
            y = z;
        }

        for (int i = x; i <= y; i++)
            if (i % 13 != 0)
                soma += i;

        System.out.println(soma);

        in.close();
    }
}
