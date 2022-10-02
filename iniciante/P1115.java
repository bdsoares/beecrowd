package beecrowd.iniciante;

/**
 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no
 * sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será
 * encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever
 * mensagem alguma).
 *
 * Entrada
 * A entrada contém vários casos de teste. Cada caso de teste contém 2 valores inteiros.
 *
 * Saída
 * Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada
 * lida, conforme o exemplo.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class P1115 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> q = new ArrayList<>();
        int x,y;

        do {
            x = in.nextInt();
            y = in.nextInt();

            if (x != 0 && y != 0) {
                ArrayList<Integer> t = new ArrayList<>();
                t.add(x);
                t.add(y);

                q.add(t);
            }

        } while (x != 0 && y != 0);

        for (ArrayList<Integer> a : q) {
            x = a.get(0);
            y = a.get(1);

            if (x > 0 && y > 0)
                System.out.println("primeiro");
            else if (x < 0 && y > 0)
                System.out.println("segundo");
            else if (x < 0 && y < 0)
                System.out.println("terceiro");
            else
                System.out.println("quarto");
        }

        in.close();
    }
}
