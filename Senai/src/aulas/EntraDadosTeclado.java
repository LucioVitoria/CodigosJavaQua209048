package aulas;

import java.util.Locale;
import java.util.Scanner;

public class EntraDadosTeclado {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		//fazer o import ao usar o Locale.US

				String nome;
				int numero = 0;
				char sexo;
				double x = 10.25;

				System.out.println("Entre com um nome: ");
				nome = leia.nextLine();

				System.out.println("entre com um numero inteiro: ");
				numero = leia.nextInt();

				System.out.println("entre com o sexo: ");
				sexo = leia.next().charAt(0);

				System.out.println("\tO nome digitado foi: " + nome);
				System.out.println("\tO nome digitado foi: " + numero);
				System.out.println("\tO sexo digitado foi: " + sexo);
				System.out.println("\tx está valendo: " + x);

				System.out.println("insira um valor para a variavel x: ");
				x = leia.nextDouble();

				System.out.println(" O valor de x agora está valendo: " + x);

				leia.close();

	}

}
