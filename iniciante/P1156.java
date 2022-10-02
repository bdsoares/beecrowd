package beecrowd.iniciante;

/**
 * Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela fórmula:
 * S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?
 *
 * Entrada
 * Não há nenhuma entrada neste problema.
 *
 * Saída
 * A saída contém um valor correspondente ao valor de S.
 * O valor deve ser impresso com dois dígitos após o ponto decimal.
 */

public class P1156 {
    public static void main(String[] args) {
        float s = 1;

        for (float i = 3, j = 2; i <= 39; i+=2, j*=2)
            s+= i/j;

        System.out.printf("%.2f\n", s);
    }
}
