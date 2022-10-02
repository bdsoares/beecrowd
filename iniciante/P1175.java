package beecrowd.iniciante;

/**
 * Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro elemento com o último, o
 * segundo elemento com o penúltimo, etc., até trocar o 10º com o 11º. Mostre o vetor modificado.
 *
 * Entrada
 * A entrada contém 20 valores inteiros, positivos ou negativos.
 *
 * Saída
 * Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor
 * armazenado naquela posição.
 */

import java.util.Scanner;

public class P1175 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] n = new int[20];

        for (int i = 19; i >= 0; i--)
            n[i] = in.nextInt();

        for (int i = 0; i < 20; i++)
            System.out.printf("N[%d] = %d\n", i, n[i]);

        in.close();
    }
}
