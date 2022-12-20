package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		/*
		 * Algoritmo que pida tres números de tipo entero y compruebe si es 
		 * posible que exista un triángulo con esas dimensiones.
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Programa que calcula si un triángulo es posible");
		System.out.println("Introduce el lado 1");
		int a = teclado.nextInt();
		System.out.println("Introduce el lado 2");
		int b = teclado.nextInt();
		System.out.println("Introduce el lado 3");
		int c = teclado.nextInt();
		
		if (a+b>c && b+c>a && a+c>b) {
			System.out.printf("EXiste el triángulo de lados %d, %d y %d", a,b,c);
		} else {
			System.out.printf("NO EXiste el triángulo de lados %d, %d y %d", a,b,c);
		}
	}

}
