package beecrowd.iniciante;

/**
 * Ler um número inteiro N e calcular todos os seus divisores.
 *
 * Entrada
 * O arquivo de entrada contém um valor inteiro.
 *
 * Saída
 * Escreva todos os divisores positivos de N, um valor por linha.
 */

import java.util.Scanner;

public class P1157 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                System.out.println(i);

        in.close();
    }
}
