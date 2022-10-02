package beecrowd.iniciante;

/**
 * Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
 *
 * Entrada
 * Não há nenhuma entrada neste problema.
 *
 * Saída
 * Imprima a sequencia conforme exemplo abaixo
 */

public class P1095 {
    public static void main(String[] args) {
        int i = 1;

        for (int j = 60; j >= 0; j-=5) {
            System.out.printf("I=" + i + " J=" + j + "\n");
            i+=3;
        }
    }
}
