package beecrowd.iniciante;

/**
 * Escreva um programa que leia 2 valores X e Y e que imprima todos os valores entre eles cujo resto da
 * divisão dele por 5 for igual a 2 ou igual a 3.
 *
 * Entrada
 * O arquivo de entrada contém 2 valores positivos inteiros quaisquer, não necessariamente em ordem
 * crescente.
 *
 * Saída
 * Imprima todos os valores conforme exemplo abaixo, sempre em ordem crescente.
 */

import java.util.Scanner;

public class P1133 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();

        if (x > y) {
            int z = x;
            x = y;
            y = z;
        }

        for (int i = x+1; i < y; i++) {
            if (i % 5 == 2 || i % 5 == 3)
                System.out.println(i);
        }

        in.close();
    }
}
