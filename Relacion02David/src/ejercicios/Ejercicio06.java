package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		/*
		 * Algoritmo que pida los parámetros (a, b y c de tipo double) de dos 
		 * rectas, correspondientes a su ecuación implícita (ax + by + c = 0), 
		 * e indique si son coincidentes, paralelas o secantes. En el caso de 
		 * que sean secantes, hay que indicar si son perpendiculares o no.
		 * Las dos rectas se definen como A1x+B1y+C1=0 y A2x+B2y+C2=0, o sea 
		 * que pedimos 6 valores por teclado:
			• Dos rectas son secantes si 𝐴𝐴1𝐴𝐴2≠𝐵𝐵1𝐵𝐵2
			• Dos rectas son perpendiculares si son secantes y 𝐴𝐴1𝐵𝐵1=−𝐵𝐵2𝐴𝐴2
			• Dos rectas son paralelas si 𝐴𝐴1𝐴𝐴2=𝐵𝐵1𝐵𝐵2
			• Dos rectas son coincidentes si son paralelas y 𝐴𝐴1𝐴𝐴2=𝐵𝐵1𝐵𝐵2=𝐶𝐶1𝐶𝐶2
		 */
		System.out.println("Programa que calcula la posición de dos rectas");
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce la recta 1");
		System.out.println("A1: ");
		double a1 = teclado.nextDouble();
		System.out.println("B1: ");
		double b1 = teclado.nextDouble();
		System.out.println("C1: ");
		double c1 = teclado.nextDouble();
		
		System.out.println("Introduce la recta 2");
		System.out.println("A2: ");
		double a2 = teclado.nextDouble();
		System.out.println("B2: ");
		double b2 = teclado.nextDouble();
		System.out.println("C2: ");
		double c2 = teclado.nextDouble();
		
		if (a1/a2 == b1/b2) {
			// Paralelas
			System.out.print("La rectas son paralelas");
			if (b1/b2==c1/c2) {
				System.out.println(" y coincidentes");
			}
		} else {
			// secantes
			System.out.print("Las rectas son secantes");
			if (a1/b1 == -b2/a2) {
				System.out.println(" y perpendiculares");
			}
		}
	}

}
