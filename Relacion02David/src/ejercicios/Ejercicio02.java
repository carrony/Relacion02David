package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		/*
		 * Calcula el menor de tres numeros introducidos por teclado
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el primer número");
		double num1 = teclado.nextDouble(); 
		System.out.println("Introduce el segundo número");
		double num2 = teclado.nextDouble(); 
		System.out.println("Introduce el tercer número");
		double num3 = teclado.nextDouble(); 
		
		if (num1<num2 && num1<num3) {
			System.out.printf("El menor es el %.2f\n",num1);
		} else if (num2<num1 && num2 <num3) {
			System.out.printf("El menor es el %.2f\n",num2);
		} else {
			System.out.printf("El menor es el %.2f\n",num3);
		}
		
		
	}

}
