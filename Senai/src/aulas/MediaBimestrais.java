package aulas;

import java.util.Locale;
import java.util.Scanner;

public class MediaBimestrais {

	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4, media;

		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite a Nota do Primeiro Bimestre: ");
		nota1 = entrada.nextDouble();

		System.out.println("digite a Nota do Segundo Bimestre: ");
		nota2 = entrada.nextDouble();

		System.out.println("Digite a Nota do Terceiro Bimestre: ");
		nota3 = entrada.nextDouble();

		System.out.println("Digite a nota do Quarto Bimestre: ");
		nota4 = entrada.nextDouble();

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.printf("A Media do aluno é = %.2f " , media);

		// Pesquisei e vi que tem como colocar aprovado e reprovado
		// if(media>digite seu numero de media){
		// System.out.println("Aluno Aprovado");}
		//
		// else if(media>Digite seu numero de media){
		// System.out.println("Aluno em recuperação");}
		// else { System.out.println("Aluno Reprovado")

		entrada.close();
	}

}
