package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios25Julho {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		/*-----	Primeira Atividade
			Faça
		    um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o
			valor seja inválido e continue pedindo até que o usuário informe um valor
			válido.*/
		    
			 
	         int nota = 0;
			
			System.out.print("Entre com a nota de zero a dez: ");
			nota = leia.nextInt();
			while(nota < 0 || nota > 10) {
				System.out.println("Insira uma nota valida");
				System.out.print("Entre com a nota de zero a dez: ");
				nota = leia.nextInt();
			}
			System.out.println("Nota recebida: " + nota );
			
			
			
			
			/*-----------Segunda atividade
			 * 2.Faça
	          um programa que leia um nome de usuário e a sua senha e não aceite a senha
	           igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as
	           informações.
			 
			
			String nome;
			String senha;
			
			System.out.print("Nome de usuario : ");
			nome = leia.nextLine();
			
			
			System.out.print("senha: ");
			senha = leia.nextLine();
			
			while(nome.equals(senha)) {
				System.out.println("\nUsuario e senha devem ser diferentes.");
				System.out.print("\nUsuario: ");
				nome = leia.nextLine();
				
				System.out.print("Senha: ");
				senha = leia.nextLine();
			}
			System.out.println("\nUsuario e Senha Gravados.");
			System.out.printf("\nUsuario: %s - Senha: %s", nome, senha );
			 */
			
			
			/*---------------Terceira atividade
			 * 3.  Faça um programa que leia e valide as seguintes informações:

	             A.Nome:maior que 3 caracteres;
	              B.Idade:entre 0 e 150;
	              C.Salário:maior que zero;
	              D.Sexo:'f' ou 'm';
	              E.EstadoCivil: 's', 'c', 'v', ‘d’;
			 */
			/*
			String nome;
			int id = 0;
			double salario = 0;
			char sx = 0;
			char eC;
			
			System.out.println("Complete.");
			
			System.out.print("\nNome Maior que 3 Letras: ");
			nome = leia.nextLine();	
			
			while(nome.length()<= 3) {
				System.out.println("Digite um nome valido, Nao aceitamos Apelidos!");
				System.out.print("Nome Maior que 3 Letras: ");
				nome = leia.nextLine();
				
			}
			System.out.print("Idade: ");
			id = leia.nextInt();
			while(id < 0 || id > 89) {
				System.out.println("Idade invalida, você não vai viver tanto assim! ");
				System.out.print("Idade: ");
				id = leia.nextInt();
			}
			System.out.print("Salario R$: ");
			salario = leia.nextDouble();
			while(salario < 0) {
				System.out.println("Valor invalido");
				System.out.print("Salario R$: ");
				salario = leia.nextDouble();
			}
			System.out.print("Seu sexo (M) ou (F): ");
			sx = leia.next().charAt(0);
			while(sx != 'f' && sx != 'm') {
				System.out.println("ERRADO!! (M) Masculino (F) Feminino! tente novamente.");
				System.out.print("Seu sexo (M) ou (F): ");
				sx = leia.next().charAt(0);
			}
			System.out.print("Estado civil [s]=Solteiro(a), [c]Casado(a), [v]Viuvo(a), [d]Divorciado(a): ");
			eC= leia.next().charAt(0);
			while(eC != 's' && eC != 'c' && eC != 'v' && eC != 'd') {
				System.out.println("Não aceitamos Enrolados, Ficando ou girias pareceidas! Preste  atenção e tente novamente! ");
				System.out.print("Estado civil [s]=Solteiro(a), [c]Casado(a), [v]Viuvo(a), [d]Divorciado(a): ");
				eC = leia.next().charAt(0);
			}
			System.out.println("Parabéns abençoado você conseguiu peencher tudo!");
			System.out.printf("\nNome: " + nome + " \nIdade: " + id + "anos \nSexo: " + sx +  " \nEstado Civil: " + eC + " \nSalario R$: " + salario + " reais");
			
		    
			*/
			
			
			
			leia.close();

	}

}
