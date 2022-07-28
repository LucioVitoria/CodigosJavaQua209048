package aulas;

import java.util.Locale;
import java.util.Scanner;

public class aulastring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		String frase = "aula java professor luan dia vinte e seis";
		char caractere = 's';
		
		System.out.println(frase.length());//conta a quantidade de caracteres incluseve espaços em braco
		
		System.out.println(frase.charAt(2));//localiza caracteres na posição indicada
		
		System.out.println(frase.lastIndexOf("j"));//localiza a ultima ocorrencia do caractere passado como parametro
		
		System.out.println(frase.concat("  foi concatenado"));//concatena strings
		
		System.out.println(frase.contentEquals("aula"));//compara se o conteudo da string e igual ao contuudo passado no parameto
		
		System.out.println(frase.endsWith("a"));//ultima ocorrencia da string e comparara se e igual ao parametro passado 
		
		System.out.println(frase.trim().endsWith("s"));
		
		System.out.println(frase.trim());// remove espaços em brancos no inicio e no final da string
		
		System.out.println(frase.toLowerCase()); //coloca todoas as letras strings em minusculo
		System.out.println(frase.toUpperCase()); // toas as letras maiusculas
		
		System.out.println(frase.replace("a", "b"));//altera uma letra por outra letra passada 
		System.out.println(frase.replace("luan", "muruk"));// altera o conjunto de caracteres
System.out.println(frase.replaceAll("a", "A"));//		
		frase = "";
		System.out.println(frase.isEmpty());//verifica se a string contem valor, retorna verdadeiro ou falso
		double x = 1254.36598; 
		
		System.out.println(String.format("%.2f", x)); //arredonda
		
		System.out.println(Character.toUpperCase(caractere));//converte para letra minuscula
		System.out.println(Character.toLowerCase(caractere));// converte para letra minuscula 
		
		
		sc.close();
	}

}
