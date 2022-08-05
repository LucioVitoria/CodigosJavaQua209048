package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios27Julho {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
	       /*-----Atividade
	        * Exercício:
	Estamos em ano de eleições. 
	A empresa "Dados Incertos" precisa fazer uma pesquisa de intenção de votos para divulgar no
	 jornal do meio dia "Jornal da meia noite ao meio dia,
	 segunda edição".
	  Os candidatos são:
	   Lula Molusco, da feira do biquíni, perdeu um tentáculo em acidente da indústria que trabalha.
	   Bolso Nelson, dizem que cuida dos fazendeiros e muitas cabeças de gado. Cilouca Gomes, 
	   pela volta do coronelismo no brasil, "O tempo do café com leite que era bom". 
	   Bolos Bolinho, parece que confeitaria é sua profissão mas na verdade ele atua no ramo imobiliário.
	     ----Crie as variáveis necessárias para contar a quantidade de votos que cada candidato possui e mostre na tela.
	 Use a estrutura de repetição que achar melhor para essa atividade.
	        */
			
		
		
		
			String nome;
			int lula = 0;
			int bolso = 0;
			int cilouca = 0;
			int bolos = 0;
			char decide = 0;
			
			System.out.println("---------Dados incertos Apresenta-------- \n----Pesquisa de intenções de voto 3022------" );
			System.out.print("Digite o nome do funcionário: ");
			nome = leia.nextLine();
			System.out.println("\n------(mensagem para o funcionário)------ \nAgente Contador de Votos " + nome + "\ndigite o numero de intenções de \nvotos adiquiridos na praça do relogio \n(Detalhe: não pode passar de 100 votos por candidato,\nsabemos que vc não vai trabalhar tanto assim.) \n----------------------------------------------- ");
			
					
			
			
			System.out.println("\n----------Votos----------\n");
			
			System.out.print("Quantidade de votos do Lula Molusco Da Feira dos Biquines: ");	
			lula = leia.nextInt();
			
			
			while(lula < 0 || lula > 100) {
				System.out.println("Quantidade de votos invalida, você não leu a mensagem para o funcionario?. \nTente novamente!");
				System.out.print("Quantidade de votos do Lula Molusco Da Feira dos Biquines: ");
				lula = leia.nextInt();
			}
			System.out.print("\nQuantidade de votos do Bolso Nelson Rei do Gado: ");
			    bolso = leia.nextInt();
				while(bolso < 0 || bolso > 100) {
					System.out.println("Quantidade de votos invalida, você não leu a mensagem para o funcionario?. \nTente novamente!");
					System.out.print("Quantidade de votos do Bolso Nelson Rei do Gado: ");
					bolso = leia.nextInt();
		   }
			System.out.print("\nQuantidade de votos do Cilouca Gomes-Coroné: ");
				cilouca = leia.nextInt();
				while(cilouca < 0 || cilouca > 100) {
					System.out.println("Você é Burro?, você não leu a mensagem para o funcionario?. \nTente novamente!");
					System.out.print("Quantidade de votos do Cilouca Gomes-Coroné: ");
					cilouca = leia.nextInt();	
		  }
				System.out.print("\nQuantidade de votos do Bolos Bolinho - Da Confeitaria a casa 'Propria' -: ");
				bolos = leia.nextInt();
				while(bolos < 0 || bolos > 100) {
					System.out.println("No final você me erra o numero ?, você não leu a mensagem para o funcionario?. \nTente novamente!");
					System.out.print("Quantidade de votos do Bolos Bolinho - Da Confeitaria a casa 'Propria' -: ");
					bolos = leia.nextInt();	
		  }		
									
			System.out.println("\nTabela completa. ");
			
			
			
			System.out.println("\n-----Resultado dos votos----");
			System.out.println("\nLula Molusco: " + lula);
				System.out.println("Bolso Nelson: " + bolso);
				System.out.println("Cilouca Gomes: " + cilouca);
				System.out.println("Bolos Bolinhos: " + bolos);

				
			System.out.println("\nEnviar Tabela Para o Jornal da Meia Noite? \nDigite 's' Para sim ou 'n' para não "); 
			decide = leia.next().charAt(0);
			while(decide != 's') {
				System.out.println("Ta Maluco ? vai enviar sim");
				System.out.print("Enviar tabela para o jornal da Meia noite? Digite 's' para Sim ");
				decide = leia.next().charAt(0);
			}
			 
			System.out.println("\nENVIADO!! Agora volte para a Central e receba seu Pão com Mortadela  ");
			
			System.out.println("\nEleições 3022 'Não acho que quem ganhar ou quem perder, nem quem ganhar nem perder,vai ganhar ou perder. \nVai todo mundo perder.'  ");
			
			leia.close();

			/*int molusco = 0;
		int nelson = 0;
		int gomes = 0;
		int bolim = 0;
		int num = 0;
		char opcao;

		System.out.println("Numeros dos candidatos:");
		System.out.println("Molusco : 31");
		System.out.println("Nelson: 10");
		System.out.println("Gomes: 51");
		System.out.println("Bolim: 20");

		/*
		do {			
			System.out.print("Qual candidato tem sua intenção de voto? entre com o numero: ");
			num = sc.nextInt();
			switch (num) {
			case 31:
				System.out.println("Sua intenção de voto foi registrada!");
				molusco++;
				break;
			case 10:
				System.out.println("Sua intenção de voto foi registrada!");
				nelson++;
				break;
			case 51:
				System.out.println("Sua intenção de voto foi registrada!");
				gomes++;
				break;
			case 20:
				System.out.println("Sua intenção de voto foi registrada!");
				bolim++;
				break;
				
			default:
				System.out.println("Numero invalido, ou candidato não disponivel!");
				break;
			}
			
			System.out.println("Deseja cadastrar outro voto?");
			opcao = sc.next().charAt(0);
		} while (Character.toLowerCase(opcao) == 's');
		
		System.out.println("O candidato molusco tem " + molusco + " votos");
		System.out.println("O candidato nelson tem " + nelson + " votos");
		System.out.println("O candidato gomes tem " + gomes + " votos");
		System.out.println("O candidato bolim tem " + bolim + " votos");
		*/
		/*
		System.out.print("Quantos votos deseja registrar: ");
		int qtdVoto = sc.nextInt();

		for(int i = 0; i < qtdVoto; i++){			
			System.out.print("Qual candidato tem sua intenção de voto? entre com o numero: ");
			num = sc.nextInt();

			switch (num) {
			case 31:
				System.out.println("Sua intenção de voto foi registrada!");
				molusco++;
				break;

			case 10:
				System.out.println("Sua intenção de voto foi registrada!");
				nelson++;
				break;

			case 51:
				System.out.println("Sua intenção de voto foi registrada!");
				gomes++;
				break;

			case 20:
				System.out.println("Sua intenção de voto foi registrada!");
				bolim++;
				break;
				
			default:
				System.out.println("Numero invalido, ou candidato não disponivel!");

				break;
			}
			
		} 
		
		System.out.println("O candidato molusco tem " + molusco + " votos");
		System.out.println("O candidato nelson tem " + nelson + " votos");
		System.out.println("O candidato gomes tem " + gomes + " votos");
		System.out.println("O candidato bolim tem " + bolim + " votos");
		*/
			
			
			
			
	}

}
