package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios21julho {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		/*
		int n1 = 0; 
		int n2 = 0;
		int n3 = 0;
		
		Deixar 0 no int  quando quiser armazenar numeros mas tem que ter o 
		leia.nextInt(); logo apos o system.out.print para armazenar o numero*/
		
		/*%d é para numeros inteiros , %s é para strings , %.2f  formatar a casa decimais que vão aparecer apos a virgula ou apos ponto,  
		  
		  /*if (n1 > n2) { System.out.printf("numero %d è o maior", n1); } 
		  else {
		  System.out.printf("numero %d é o maior", n2);  
		  leia.close();}
		 
		  
		  System.out.print("entre com o primeiro numero: "); n1 = leia.nextInt(); 
		  
		  System.out.print("entre com o segundo numero: "); n2 = leia.nextInt();
		  
		  System.out.print("entre com o terceiro numero: "); n3 = leia.nextInt();
		  
		  if(n1 > n2 && n1 > n3) {
		  
		  System.out.println("O Maior numero é: " + n1); } 
		  else if (n2 > n3) {
		  System.out.println("o Maior numero é: " + n2); } 
		  else {
		  System.out.println("o maior numero é: " + n3); }
		 */
		
		int numero = leia.nextInt();
		
		System.out.println("entre com um numero: ");
		
	
		switch (numero) {
		case 1:
			
		break;
		default:
			break;
		}
			
			
		  leia.close();

	}

}
