package beecrowd.iniciante;

/**
 * A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a
 * tabela abaixo:
 *
 * Salário				Percentual de Reajuste
 * 0 - 400.00			15%
 * 400.01 - 800.00		12%
 * 800.01 - 1200.00		10%
 * 1200.01 - 2000.00	7%
 * Acima de 2000.00		4%
 *
 * Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e
 * o índice reajustado, em percentual.
 *
 * Entrada
 * A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.
 *
 * Saída
 * Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste (ambos devem ser apresentados
 * com 2 casas decimais) e o percentual de reajuste ganho, conforme exemplo abaixo.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1048 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double salario = in.nextDouble();
		
		if (salario >= 0 && salario <= 400) {
			System.out.println("Novo salario: " + df.format((salario + salario * 0.15)));
			System.out.println("Reajuste ganho: " + df.format(salario * 0.15));
			System.out.println("Em percentual: 15 %");
		} else if (salario > 400 && salario <= 800) {
			System.out.println("Novo salario: " + df.format((salario + salario * 0.12)));
			System.out.println("Reajuste ganho: " + df.format(salario * 0.12));
			System.out.println("Em percentual: 12 %");
		} else if (salario > 800 && salario <= 1200) {
			System.out.println("Novo salario: " + df.format((salario + salario * 0.10)));
			System.out.println("Reajuste ganho: " + df.format(salario * 0.10));
			System.out.println("Em percentual: 10 %");
		} else if (salario > 1200 && salario <= 2000) {
			System.out.println("Novo salario: " + df.format((salario + salario * 0.07)));
			System.out.println("Reajuste ganho: " + df.format(salario * 0.07));
			System.out.println("Em percentual: 7 %");
		} else {
			System.out.println("Novo salario: " + df.format((salario + salario * 0.04)));
			System.out.println("Reajuste ganho: " + df.format(salario * 0.04));
			System.out.println("Em percentual: 4 %");
		}
		
		in.close();
	}

}
