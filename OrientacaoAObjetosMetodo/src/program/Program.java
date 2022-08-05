package program;

import java.util.Locale;
import java.util.Scanner;

import entities.FormulaHeron;

public class Program {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in).useLocale(Locale.US);
		
		double x = FormulaHeron.CalcularAreaTriangulo(10, 10, 10);
		System.out.println("A area do triangulo: " + x);
		
		
		
		
		
sc.close();
	}

}
