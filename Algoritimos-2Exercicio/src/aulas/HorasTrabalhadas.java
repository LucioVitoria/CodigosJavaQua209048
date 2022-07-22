package aulas;

import java.util.Scanner;

public class HorasTrabalhadas {

	public static void main(String[] args) {

		double hora,numero,resultado;

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quanto Você ganha por Hora: ");
		hora = entrada.nextDouble();

		System.out.println("Digite o Numero de Horas Trabalhadas no mês: ");
		numero = entrada.nextDouble();
		
		resultado = hora * numero;
		System.out.println("Seu Salario desse Mês: " + resultado);
		
		entrada.close();
	}

}
