package aulas;

import java.util.Locale;
import java.util.Scanner;

public class exercicios1Agosto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		/* 1. Crie um programa para receber os dados de uma pessoa (altura, peso, idade e sexo),
		 *  imprima na tela seu imc e se está dentro do peso ideal, sobrepeso ou abaixo do peso; */

		 

        double altura= 0.0;
		int idade =0;
		double peso = 0.0;
		char sexo;
 

		 		
		System.out.print("Informe sua altura: ");
		altura=leia.nextDouble();
		
		System.out.print("Informe sua peso: ");
		 peso=leia.nextDouble();
		 
		System.out.println("Informe idade: ");
		 idade=leia.nextInt();
		
		 System.out.println("Informe seu sexo: ");
		 sexo=leia.next().charAt(0);
		 
		 
		// vamos calcular o IMC 
		double imc = peso / (altura * altura);
		System.out.println("Seu IMC é: " + imc);
		
		// vamos mostrar a classificação
		if(imc < 16){
		System.out.println("Sua classificação é Magreza grave"); }
		else if((imc >= 16) && (imc < 17)){
		System.out.println("Sua classificação é Magreza moderada"); }
		else if((imc >= 17) && (imc < 18.5)){
		System.out.println("Sua classificação é Magreza leve"); }
		else if((imc >= 18.5) && (imc < 25)){
		System.out.println("Sua classificação é Saudável"); }
		else if((imc >= 25) && (imc < 30)){
		System.out.println("Sua classificação é Sobrepeso"); }
		else if((imc >= 30) && (imc < 35)){
		System.out.println("Sua classificação é Obesidade Grau I"); }
		else if((imc >= 35) && (imc < 40)){
		System.out.println("Sua classificação é Obesidade Grau II"); }
		else{System.out.println("Sua classificação é Obesidade Grau III (mórbida)"); }
		System.out.println("\n");
					
		
		
		
		
		//double altura = Double.parseDouble(leia.nextLine());
		/*
		System.out.println("entre com a altura: ");
		altura=leia.nextDouble();
		System.out.println("entre com a idade: ");
		idade=leia.nextInt();
		System.out.println("entre com o peso; ");
		peso=leia.nextDouble();
		System.out.println("entre com o sexo: ");
		sexo=leia.next().charAt(0);
		System.out.printf("lucio tem %d e esta com o peso: %.2f" , idade, peso);
		
		System.out.println(CalcularIMC(altura, peso));
		
		leia.close();
		
	}
		
	public static String CalcularIMC(double a, double p) {
		double imc = (p/(a*a));
		
		return "a pessoa esta com o pes: " + imc;
		*/
		
		
		
		
		
//lei.close();
	}

}
