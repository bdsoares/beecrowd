package beecrowd.iniciante;

import java.util.Scanner;

public class P1828 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(in.nextLine());

        for (int i = 0; i < n; i++) {
            sb.append("Caso #" + (i+1) + ": " + calculaVencedor(in.nextLine().split(" ")));
            sb.append("\n");
        }

        System.out.print(sb);

        in.close();
    }

    public static String calculaVencedor(String[] caso) {
        String sheldon = caso[0];
        String raj = caso[1];

        if (sheldon.equals(raj))
            return "De novo!";
        else if ((sheldon.equals("tesoura") && raj.equals("papel")) ||
                (sheldon.equals("papel") && raj.equals("pedra")) ||
                (sheldon.equals("pedra") && raj.equals("lagarto")) ||
                (sheldon.equals("lagarto") && raj.equals("Spock")) ||
                (sheldon.equals("Spock") && raj.equals("tesoura")) ||
                (sheldon.equals("tesoura") && raj.equals("lagarto")) ||
                (sheldon.equals("lagarto") && raj.equals("papel")) ||
                (sheldon.equals("papel") && raj.equals("Spock")) ||
                (sheldon.equals("Spock") && raj.equals("pedra")) ||
                (sheldon.equals("pedra") && raj.equals("tesoura")))
            return "Bazinga!";
        else
            return "Raj trapaceou!";
    }
}
