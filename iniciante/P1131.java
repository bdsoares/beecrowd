package beecrowd.iniciante;

/**
 * A Federação Gaúcha de Futebol contratou você para escrever um programa para fazer uma estatística
 * do resultado de vários GRENAIS. Escreva um programa para ler o número de gols marcados pelo Inter
 * e pelo Grêmio em um GRENAL. Logo após escrever a mensagem "Novo grenal (1-sim 2-nao)" e solicitar
 * uma resposta. Se a resposta for 1, o algoritmo deve ser executado novamente solicitando o número
 * de gols marcados pelos times em uma nova partida, caso contrário deve ser encerrado imprimindo:
 *
 * - Quantos GRENAIS fizeram parte da estatística.
 * - O número de vitórias do Inter.
 * - O número de vitórias do Grêmio.
 * - O número de Empates.
 * - Uma mensagem indicando qual o time que venceu o maior número de GRENAIS (ou "Nao houve
 * vencedor", caso termine empatado).
 *
 * Entrada
 * O arquivo de entrada contém 2 valores inteiros, correspondentes aos gols marcados pelo Inter e pelo
 * Grêmio respectivamente. Em seguida háverá um inteiro (1 ou 2), correspondente à repetição do programa.
 *
 * Saída
 * Após cada leitura dos gols, deve ser impressa a mensagem "Novo grenal (1-sim 2-nao)". Quando o
 * algoritmo for encerrado devem ser mostradas as estatísticas conforme a descrição apresentada acima.
 * Obs: a palavra "Gremio" deve ser impressa sem acento, conforme o exemplo abaixo.
 */

import java.util.Scanner;

public class P1131 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grenais = 0;
        int[] results = {0,0,0}; //[0] Inter; [1] Gremio; [2] Empates;
        boolean stop;

        do {
            int inter = in.nextInt();
            int gremio = in.nextInt();

            if (inter > gremio)
                results[0]++;
            else if (gremio > inter)
                results[1]++;
            else
                results[2]++;

            int resp;
            do {
                System.out.println("Novo grenal (1-sim 2-nao)");
                resp = in.nextInt();
            } while (resp != 1 && resp!= 2);

            stop = resp != 1; // Caso a resposta seja diferente de 1 (true) (parar laço).
            grenais++;
            in.nextLine(); // Limpar Scanner.
        } while (!stop); // Enquanto stop for false;

        System.out.printf("%d grenais\n", grenais);
        System.out.printf("Inter:%d\n", results[0]);
        System.out.printf("Gremio:%d\n", results[1]);
        System.out.printf("Empates:%d\n", results[2]);

        if (results[0] > results[1])
            System.out.println("Inter venceu mais");
        else if (results[0] < results[1])
            System.out.println("Gremio venceu mais");
        else
            System.out.println("Nao houve vencedor");

        in.close();
    }
}
