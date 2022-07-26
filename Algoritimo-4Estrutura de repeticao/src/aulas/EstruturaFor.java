package aulas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		// Contador ou letra i
		//usamos o for quando ja sabemos a quantidade de vezes que queremos executar determinada condição
		/*for(int i = 0; i <= 10; i++) {
			System.out.println("o contador esta valendo: " + i);
		}
		
		int i = 0;
		//usamaos  while usamos quando não sabemos a quantidade de vezes que precisamos executar 
		//determinado bloco de codigo
		
       while(i <= 10) {
    	   System.out.println("o contador do while esta valendo: " + i);
    	   i++;
       }
       
       do { 
    	   System.out.println("o contador do while esta valendo: " + i);
    	   ++i
       } while(i < 10);*/
    	   
		
	/*	int condicao = 0;
		int somar = 0;
		
		System.out.println("entre com o numero 1 para s e 2 para não");
    	   condicao = sc.nextInt();
    
	while (condicao == 1) {
	System.out.println(" apertou 1");
	System.out.println("entre com o numero 1 para s e 2 para não");
	   condicao = sc.nextInt();
	somar++;
		}*/
    	   /*do { 
    		   System.out.println("entre com o numero 1 para s e 2 para não");
    	   condicao = sc.nextInt();
    		   
    	   }while(condicao == 1);
    	   
	System.out.println("saiu do bloco de repeticao! repetiu: " + somar);*/
    	   
    	   
    	  /* String nome = "lucio";
    		String  aux;
    			   
    			   System.out.println("digite um nome: ");
    	   aux = sc.nextLine();
    	   
    	   if (nome.equals(aux) ) {
	System.out.println("impromiu");
    	   }
    	   */
	sc.close();
	
	
	
	
	
       
       
       
	}

}
