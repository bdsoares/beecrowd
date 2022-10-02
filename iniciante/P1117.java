package beecrowd.iniciante;

/**
 * Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a
 * média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer
 * ao intervalo [0,10]). Cada nota deve ser validada separadamente.
 *
 * Entrada
 * A entrada contém vários valores reais, positivos ou negativos. O programa deve ser encerrado
 * quando forem lidas duas notas válidas.
 *
 * Saída
 * Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
 * Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor
 * do cálculo. O valor deve ser apresentado com duas casas após o ponto decimal.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class P1117 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Float> valids = new ArrayList<>();
        ArrayList<Float> invalids = new ArrayList<>();

        do {
            float n = in.nextFloat();

            if (n >= 0 && n <= 10)
                valids.add(n);
            else
                invalids.add(n);
        } while (valids.size() != 2);

        for (Float f : invalids)
            System.out.println("nota invalida");

        System.out.printf("media = %.2f\n",
                ((valids.get(0) + valids.get(1))/2));


        in.close();
    }
}
