package beecrowd.iniciante;

/**
 * Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
 *
 * Entrada
 * Não há nenhuma entrada neste problema.
 *
 * Saída
 * Imprima a sequencia conforme exemplo abaixo.
 */

import java.text.DecimalFormat;

public class P1098 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");

        for (float i = 0; i <= 2.2; i+=.2)
            for (float j = 1; j <= 3; j++) {
                float k = i+j;
                System.out.println("I=" + (df.format(i).endsWith("0") ? (int)i : df.format(i)) +
                                    " J=" + (df.format(k).endsWith("0") ? (int)k : df.format(k)));
            }
    }
}
