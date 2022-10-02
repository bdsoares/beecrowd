package beecrowd.estruturas;

/**
 * Dada uma expressão qualquer com parênteses, indique se a quantidade de parênteses está correta
 * ou não, sem levar em conta o restante da expressão. Por exemplo:
 *
 * a+(b*c)-2-a        está correto
 * (a+b*(2-c)-2+a)*2  está correto
 *
 * enquanto
 *
 * (a*b-(2+c)         está incorreto
 * 2*(3-a))           está incorreto
 * )3+b*(2-c)(        está incorreto
 *
 * Ou seja, todo parênteses que fecha deve ter um outro parênteses que abre correspondente e não
 * pode haver parênteses que fecha sem um previo parenteses que abre e a quantidade total de
 * parenteses que abre e fecha deve ser igual.
 *
 * Entrada
 * Como entrada, haverá N expressões (1 <= N <= 10000), cada uma delas com até 1000 caracteres.
 *
 * Saída
 * O arquivo de saída deverá ter a quantidade de linhas correspondente ao arquivo de entrada, cada
 * uma delas contendo as palavras correct ou incorrect de acordo com as regras acima fornecidas.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P1068 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String exp;

        while ((exp = br.readLine()) != null) // EOF
            list.add(exp);

        for (String s : list) {
            int[] control = new int[2]; // 0 open; 1 close;
            boolean incorrect = false;

            for (int i = 0; i < s.length(); i++) {
                boolean open = '(' == s.charAt(i);
                boolean close = ')' == s.charAt(i);

                if (open || close) {
                    if (close && control[0] == control[1])
                        incorrect = true;
                    else if (open)
                        control[0]++;
                    else
                        control[1]++;
                }
            }

            if (control[0] != 0 || control[1] != 0) {
                if (incorrect || control[0] != control[1])
                    System.out.println("incorrect");
                else
                    System.out.println("correct");
            }
        }
    }
}
