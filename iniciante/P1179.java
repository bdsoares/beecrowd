package beecrowd.iniciante;

/**
 * Neste problema você deverá ler 15 valores colocá-los em 2 vetores conforme estes valores forem
 * pares ou ímpares. Só que o tamanho de cada um dos dois vetores é de 5 posições. Então, cada vez
 * que um dos dois vetores encher, você deverá imprimir todo o vetor e utilizá-lo novamente para os
 * próximos números que forem lidos. Terminada a leitura, deve-se imprimir o conteúdo que restou em
 * cada um dos dois vetores, imprimindo primeiro os valores do vetor impar. Cada vetor pode ser
 * preenchido tantas vezes quantas for necessário.
 *
 * Entrada
 * A entrada contém 15 números inteiros.
 *
 * Saída
 * Imprima a saída conforme o exemplo abaixo.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class P1179 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            int n = in.nextInt();

            if (n % 2 == 0) par.add(n);
            else impar.add(n);

            if (par.size() == 5) {
                showArray("par", par);
                par.clear();
            }

            if (impar.size() == 5) {
                showArray("impar", impar);
                impar.clear();
            }
        }

        showArray("impar", impar);
        showArray("par", par);

        in.close();
    }

    public static void showArray(String text, ArrayList<Integer> array) {
        for (int j = 0; j < array.size(); j++)
            System.out.printf("%s[%d] = %d\n", text, j, array.get(j));
    }
}
