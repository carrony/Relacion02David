package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		/*
		 * Algoritmo que pida los parĆ”metros (a, b y c de tipo double) de dos 
		 * rectas, correspondientes a su ecuaciĆ³n implĆ­cita (ax + by + c = 0), 
		 * e indique si son coincidentes, paralelas o secantes. En el caso de 
		 * que sean secantes, hay que indicar si son perpendiculares o no.
		 * Las dos rectas se definen como A1x+B1y+C1=0 y A2x+B2y+C2=0, o sea 
		 * que pedimos 6 valores por teclado:
			ā¢ Dos rectas son secantes si š“š“1š“š“2ā šµšµ1šµšµ2
			ā¢ Dos rectas son perpendiculares si son secantes y š“š“1šµšµ1=āšµšµ2š“š“2
			ā¢ Dos rectas son paralelas si š“š“1š“š“2=šµšµ1šµšµ2
			ā¢ Dos rectas son coincidentes si son paralelas y š“š“1š“š“2=šµšµ1šµšµ2=š¶š¶1š¶š¶2
		 */
		System.out.println("Programa que calcula la posiciĆ³n de dos rectas");
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
