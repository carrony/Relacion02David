package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		/*
		 * 1. Algoritmo que pida dos enteros y que indique el mayor y el menor, 
		 * o si ambos son iguales.
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		double num1 = teclado.nextDouble();
		System.out.println("Introduce otro número: ");
		double num2 = teclado.nextDouble();
		
		if (num1==num2) {
			System.out.println("Los dos números son iguales.");
		} else {
			if (num1<num2) {
				System.out.printf("El menor es %.2f y el mayor es %.2f", num1,num2);
			} else {
				System.out.printf("El menor es %.2f y el mayor es %.2f", num2,num1);
			}
		}

	}

}
