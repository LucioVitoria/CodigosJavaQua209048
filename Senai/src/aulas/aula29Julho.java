package aulas;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class aula29Julho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		/*
		ArrayList<String> lista = new ArrayList<>();
						
		int[][] numerosArray = new int [3][3];
		
	    int contador = 10;
	
	    for (int i = 0; i < numerosArray.length; i++) {
		
		for(int j = 0; j < numerosArray.length; j++) {
			
			numerosArray[i][j] = contador;
		
		System.out.print(numerosArray[i][j] + "\t");
		contador++;
				}
		System.out.println("\n");	
	}
		*/
	
		ArrayList<String> lista = new ArrayList<>();
		
		int[][] numerosArray = new int [3][3];
		
	    int contador = 10;
	
	    for (int i = 0; i < numerosArray.length; i++) {
	         	
	    	for(int j = 0; j < numerosArray.length; j++) {
			
			numerosArray[i][j] = contador;
		
		System.out.print(numerosArray[i][j] + "\t");
		contador++;
				}
		System.out.println();	
	}
	System.out.println("Numeros na diagonal: ");
	    for (int i = 0; i < numerosArray.length; i++) {
	    	for(int j = 0; j < numerosArray.length; j++) {
	    		if(numerosArray[i] == numerosArray[j]) {
	    			System.out.println(numerosArray[i][j] + "\t");
	    		}
	    	}
	    	
	    }
	
	
	}

}
