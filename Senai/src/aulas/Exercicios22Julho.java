package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios22Julho {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		/*
		 * Exercico exercícios if/else{ ---------Primeiro Faça um programa que peça o
		 * nome e a senha e faça a verificação de uma variável que obtenha a senha e o
		 * usuário (como se fosse cadastrado) e retorne erro caso a senha ou o usuário
		 * esteja errado. A mensagem a ser mostrada deve ser de acordo com o respectivo
		 * erro!
		 */

		/*
		 * String nome;
		 * String nomeCadastrado;
		 *  int senha = 0; 
		 *  int senhaCadastrada = 0;
		 * 
		 * System.out.print("Cadastre seu Login: "); nome = leia.nextLine();
		 * 
		 * System.out.println("Cadastre uma senha: "); senha = leia.nextInt();
		 * 
		 * leia.nextLine(); System.out.print("\nDigite Novamente o usuario: ");
		 * nomeCadastrado = leia.nextLine();
		 * 
		 * if (nome.equals(nomeCadastrado)) {
		 * System.out.print("\nLogin cadastrado corretamente!");
		 * System.out.print("\nDigite novamente a senha: "); senhaCadastrada =
		 * leia.nextInt(); } else {
		 * System.out.println("Login invalido, verifique novamente!"); }if (senha ==
		 * senhaCadastrada) { System.out.println("\nA senha foi cadastrada! \n"); }else
		 * {System.out.print("senha incorreta!"); }
		 */

		/*---------------Segundo
		Peça para o usuário inserir o valor do seu salario bruto e faça o desconto de 5% do IRPF,
		e 11 % do INSS e mostre o salario liquido. Se o salario liquido for menor que 1200,00 o profissional receberá 5% a mais de bônus,
		se o salario liquido ultrapassar 3500,00 o funcionario recebera 2% a mais de bônus
		 */

		/*
		 * double salarioBruto = 0; double descontoIrpf = 0; double descontoInss = 0;
		 * double salarioLiquido = 0; double salarioFinal = 0; double bonus = 0;
		 * 
		 * System.out.print("Digite o valor do salário bruto R$:"); salarioBruto =
		 * leia.nextDouble();
		 * 
		 * descontoIrpf = 0.05 * salarioBruto; descontoInss = 0.11 * salarioBruto;
		 * salarioLiquido = salarioBruto - descontoIrpf - descontoInss;
		 * 
		 * System.out.print("Valor do desconto IRPF R$: " + descontoIrpf);
		 * System.out.print("\nValor do desconto INSS R$: " + descontoInss);
		 * System.out.print("\nValor do Salário liquido R$: " + salarioLiquido);
		 * 
		 * if (salarioLiquido <= 1200) { bonus = 0.05 * salarioLiquido; salarioFinal =
		 * salarioLiquido + bonus; System.out.printf("\nValor do Bônus obtido R$: %.2f",
		 * bonus); System.out.print("\nO valor do salário final é equivalente a R$: " +
		 * salarioFinal); }else { bonus = 0.02 * salarioLiquido; salarioFinal =
		 * salarioLiquido + bonus; System.out.printf("\nValor do Bônus obtido R$: %.2f",
		 * bonus); System.out.print("\nO valor do salário final é equivalente a R$: " +
		 * salarioFinal); }
		 * 
		 */

		/*
		 * ----------------- Terceiro Exercício Switch/Case{ Faça um programa que peça
		 * ao usuário para escolher o item de um menu e a quantidade: (apenas 1 item) 1
		 * - sanduiche natureba 2 - Sanduba Bomba 3 - Coxinha de Jaca 4 - Feijoada
		 * vegetariana
		 */
		
		/*int numPedido = 0;
		int qtdPedido = 0;
		
		System.out.println("Cardapio");
		System.out.println("1 - Sanduiche Natureba");
		System.out.println("2 - Sanduba Bomba");
		System.out.println("3 - Coxinha da Jaca");
		System.out.println("4 - Feijoada Vegetariana");
		
		System.out.print("Escolha o número do seu pedido (Apenas 1 item): ");
		numPedido = leia.nextInt();
		
		
		switch (numPedido) {
		case 1:
			System.out.print("Escolha a quantidade: ");
			qtdPedido = leia.nextInt();
			break;
		case 2:
			System.out.print("Escolha a quantidade: ");
			qtdPedido = leia.nextInt();
			break;
		case 3:
			System.out.print("Escolha a quantidade: ");
			qtdPedido = leia.nextInt();
			break;
		case 4:
			System.out.print("Escolha a quantidade: ");
			qtdPedido = leia.nextInt();
			break;
		default:
			System.out.print("Escolha uma opção valida do cardapio!");
			break;
		}
		System.out.printf("Vocè escolheu o item %d do cardapio e a quantidade de %d item!", numPedido, qtdPedido);*/
		

		
		
		/*-------------------Quarto exercico
		 * Faça um programa que peça ao usuário para digitar um numero entre 1 e 7  não podendo ser maior e nem menor.
		 *  O numero que a pessoa escolher representará um dia da semana (a semana começa no domingo). 
		 
		
         int numero = 0;
		
		System.out.print("Digite um numero entre 1 e 7: ");
		numero = leia.nextInt();
		
		switch (numero) {
		case 1:
			System.out.printf("Você escolheu o Domingo que é representado pelo numero %d", numero);
			break;
		case 2:
			System.out.printf("Você escolheu a Segunda-feira que é representado pelo numero %d!", numero);
			break;
		case 3:
			System.out.printf("Você escolheu a Terça-feira que é representado pelo numero %d!", numero);
			break;
		case 4:
			System.out.printf("Você escolheu a Quarta-feira que é representado pelo numero %d!", numero);
			break;
		case 5:
			System.out.printf("Você escolheu a Quinta-feira que é representado pelo numero %d!", numero);
			break;
		case 6:
			System.out.printf("Você escolheu a Sexta-feira que é representado pelo numero %d!", numero);
			break;
		case 7:
			System.out.printf("Você escolheu o Sabado que é representado pelo numero %d!", numero);
			break;
		default:
			System.out.println("Você deve selecionar uma opção valida entra 1 e 7!!!");
			break;
		}
		
		
		*/
				
	
		
		
		
		leia.close();

	}

}
