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

public class P1096 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i+=2)
            for (int j = 7; j >= 5; j--)
                System.out.printf("I=" + i + " J=" + j + "\n");
    }
}
