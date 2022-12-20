package ejercicios;

import java.util.Scanner;

public class Ejercicio08bis2 {

	public static void main(String[] args) {
		/*
		 * CAlculadora sencilla
		 * Escribir un programa que implemente una pequeña calculadora con
		 *  switch-case. El programa pedirá al usuario los operandos (a y b)
		 *   y la operación a realizar: suma, resta, multiplicación, división, 
		 *   raíz cuadrada del primer número y elevar el primer número al segundo.
		 *    En función de la opción seleccionada se realizará una de las 
		 *    operaciones aritméticas.
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el número 1: ");
		double num1 = teclado.nextDouble();
		System.out.println("Introduce el número 2: ");
		double num2 = teclado.nextDouble();
		
		System.out.println("=================================");
		System.out.println("suma. Suma. ");
		System.out.println("resta. resta. ");
		System.out.println("mult. multiplicación");
		System.out.println("div. División");
		System.out.println("raiz. Raíz cuadrada del primer número.");
		System.out.println("potencia. Elevar el primer número al segundo");
		System.out.println("Introduce una opción (1-6)");
		teclado.nextLine();
		String opcion = teclado.nextLine();
		
		//opcion.toLowerCase().equals("suma")
		//if (opcion.equals("suma")) { 
		if (opcion.equalsIgnoreCase("suma")) { 
			System.out.printf("%.2f+%.2f=%.2f", num1, num2, num1+num2);
		} else if (opcion.equalsIgnoreCase("resta")) {
			System.out.printf("%.2f-%.2f=%.2f", num1, num2, num1-num2);
		}else if (opcion.equalsIgnoreCase("mult")) {
			System.out.printf("%.2f*%.2f=%.2f", num1, num2, num1*num2);
		} else if (opcion.equalsIgnoreCase("div")) {
			System.out.printf("%.2f/%.2f=%.2f", num1, num2, num1/num2);
		} else if (opcion.equalsIgnoreCase("raiz")) {
			System.out.printf("raíz cuadrada(%.2f)=%.2f", num1, Math.sqrt(num1));
		} else if (opcion.equalsIgnoreCase("potencia")) {
			System.out.printf("%.2f^%.2f=%.2f", num1, num2, Math.pow(num1, num2));
		} else {
			System.out.println("Opción incorrecta");
		}
	}

}
