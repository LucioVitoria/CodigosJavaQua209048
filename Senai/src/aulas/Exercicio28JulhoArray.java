package aulas;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio28JulhoArray {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		/*
		int[] numero = new int [5];// declara a quantidade de posiçoes do array
	    int[] numero2 = {1 , 25 , 10}; // inicializa o array
		
		System.out.println(numero2[1]); // obtem o valor do array no indice indicado
		System.out.println(numero[4]); // resultado vai ser zero, pois temos somente a quantidadede de posições
		System.out.println(numero.length); //obtem o tamanho do array
		
		System.out.println("entre com a quantidade");
		int qtd = sc.nextInt();
		
		int [] passadoTeclado = new int[qtd];
		
		System.out.println("quantidade de poçoes: " + passadoTeclado.length);
		*/
		/*
		int[] numero = { 1 , 10 , 25 , 9 , 50};
		
		for(int i = 0; i < numero.length; i++) {
			System.out.println("posição: " + i + ", vlor no array: " + numero[i]);
		}
		*/
	/*
	// for each = para ate;
	int[] numeros = { 1 , 10 , 25 , 9 , 50};
	for (int numero : numeros) {
		System.out.println(numero);
	}
	*/
	
	/*
	System.out.println("entre com a quantidade de nomes; ");
	int qtd = sc.nextInt();
	
	
	String [] nomes = new String[qtd];
	sc.nextLine();
	for( int i =0; i < nomes.length; i++ ) {
		;
		System.out.println("entre com o nome: ");
		nomes[i]= sc.nextLine();
		
	}
	
	for(int i = 0; i < nomes.length; i++) {
		System.out.println("nome: " + nomes[i]);
	}
	
		for (String nome : nomes) {
			System.out.println(nome);
		}
		*/
		// ----------Correção-----Exercicio 
	
	// exercicio Notas
	/*
	double[] nota = new double[4];
	double media = 0.0;
	
	for( int i = 0; i < nota.length; i++) {
		System.out.printf("entre com a nota");
		nota[i] = sc.nextDouble();
		media += nota[i] / 4;
	}
	
	//media = nota[0] + nota[1] + nota[2] + nota[3]) / nota.length;
	
	System.out.printf("a media da nota foi %.2f", media);
	*/
	// Exercicio 2 
	/*
	int[] idade = new int[2];
	double[] altura = new double [5];
	
	for (int i = 0; i < idade.length; i++) {
		System.out.print("entre com a idade");
	idade[i] = sc.nextInt();
	
	System.out.print("entre com a altura");
	altura[i] = sc.nextDouble();
	
	}
	
	for (int i = 0; i < idade.length; i++) {
		
		System.out.println("idade: " + idade[i]);
		System.out.println("altura: "+ altura[i]);
	}
	
	*/
	
	ArrayList<String> lista = new ArrayList<>();

	lista.add("Lucio");
	lista.add("fernanda");
	lista.add("Rafael");
     lista.add("Eduardo");
     
     System.out.println(lista.get(2));
     
     for(String nomeNaLista : lista) {
    	 System.out.println(nomeNaLista);
     }
     
     
     
     
		sc.close();
	}

}
