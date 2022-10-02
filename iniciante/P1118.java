package beecrowd.iniciante;

/**
 * Escreva um programa para ler as notas da primeira e a segunda avaliação de um aluno. Calcule e
 * imprima a média semestral. O programa só deverá aceitar notas válidas (uma nota válida deve
 * pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.
 *
 * No final deve ser impressa a mensagem “novo calculo (1-sim 2-nao)”, solicitando ao usuário que
 * informe um código (1 ou 2) indicando se ele deseja ou não executar o algoritmo novamente, (aceitar
 * apenas os código 1 ou 2). Se for informado o código 1 deve ser repetida a execução de todo o
 * programa para permitir um novo cálculo, caso contrário o programa deve ser encerrado.
 *
 * Entrada
 * O arquivo de entrada contém vários valores reais, positivos ou negativos. Quando forem lidas duas
 * notas válidas, deve ser lido um valor inteiro X . O programa deve parar quando o valor lido para este X
 * for igual a 2.
 *
 * Saída
 * Se uma nota inválida for lida, deve ser impressa a mensagem “nota invalida”. Quando duas notas
 * válidas forem lidas, deve ser impressa a mensagem “media = ” seguido do valor do cálculo.
 *
 * Antes da leitura de X deve ser impressa a mensagem "novo calculo (1-sim 2-nao)" e esta mensagem
 * deve ser apresentada novamente se o valor da entrada padrão para X for menor do que 1 ou maior
 * do que 2, conforme o exemplo abaixo.
 *
 * A média deve ser impressa com dois dígitos após o ponto decimal.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class P1118 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Float> valids = new ArrayList<>();
        boolean stop = false;

        do {
            float n = in.nextFloat();

            if (n >= 0 && n <= 10) {
                valids.add(n);

                if (valids.size() == 2) {   // Entra na condição quando há duas notas válidas.
                    System.out.printf("media = %.2f\n",
                            ((valids.get(0) + valids.get(1)) / 2));

                    valids.clear();

                    int res;

                    do {
                        System.out.println("novo calculo (1-sim 2-nao)");
                        res = in.nextInt();
                    } while (res != 1 && res != 2); // Repete o laço até que a resposta seja 1 ou 2.

                    stop = res != 1; // Se a resposta for difente de 1 (true).
                }
            } else
                System.out.println("nota invalida");
        } while (!stop); // Para caso a resposta seja diferente de 1.

        in.close();
    }
}
