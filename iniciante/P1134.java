package beecrowd.iniciante;

/**
 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus
 * clientes. Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte
 * forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da
 * faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será
 * encerrado quando o código informado for o número 4.
 *
 * Entrada
 * A entrada contém apenas valores inteiros e positivos.
 *
 * Saída
 * Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
 * tipo de combustível, conforme exemplo.
 */

import java.util.Scanner;

public class P1134 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] combustiveis = new int[3]; // 1 = Álcool; 2 = Gasolina; 3 = Diesel;
        int op;

        do {
            op = in.nextInt();

            switch (op) {
                case 1 -> combustiveis[0]++;
                case 2 -> combustiveis[1]++;
                case 3 -> combustiveis[2]++;
            }
        } while (op != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", combustiveis[0]);
        System.out.printf("Gasolina: %d\n", combustiveis[1]);
        System.out.printf("Diesel: %d\n", combustiveis[2]);

        in.close();
    }
}
