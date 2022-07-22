package aulas;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o Primeiro Número: ");
		int n1 = scan.nextInt();
		System.out.println("Digite o Segundo Nùmero: ");
		int n2 = scan.nextInt();

		int soma = n1 + n2;
		int subtracao = n1 - n2;
		int multiplicacao = n1 * n2;
		int divisao = n1 / n2;

		System.out.println("Sua Soma é = " + soma);
		System.out.println("Sua Subtração é = " + subtracao);
		System.out.println("Sua Multiplicação é = " + multiplicacao);
		System.out.println("Sua Divisão é = " + divisao);

scan.close();		
	}

}
