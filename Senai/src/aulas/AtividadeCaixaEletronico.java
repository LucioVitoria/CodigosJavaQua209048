package aulas;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeCaixaEletronico {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		// fazer o import ao usar o Locale.US

		String nome;
		int numero = 0;
		int numero1 = 0;
		char sexo;

		System.out.println("Entre com um nome: ");
		nome = leia.nextLine();
		System.out.println("Entre com sua idade: ");
		numero1 = leia.nextInt();
		System.out.println("Entre com o sexo: ");
		sexo = leia.next().charAt(0);
		System.out.println("Entre com sua senha: ");
		numero = leia.nextInt();
		System.out.println(nome + " tem : " + numero1 + " Anos");
		System.out.println("Seu sexo é: " + sexo);
		System.out.println("Possui a Imensa fortuna de $254.825,82 reais no banco");
		leia.close();

	}

}
