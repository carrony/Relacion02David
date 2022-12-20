package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		/*
		 * ALgoritmo que indica el número central entre 3 números
		 * 
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("ALgoritmo que indica el número central entre 3 números");
		System.out.println("Introduce el primer número: ");
		float num1 = teclado.nextFloat();
		System.out.println("Introduce el segundo número: ");
		float num2 = teclado.nextFloat();
		System.out.println("Introduce el tercero número: ");
		float num3 = teclado.nextFloat();
		
		if ((num1 > num2 && num1 < num3) || (num1 > num3 && num1 < num2)) {
			System.out.printf("El numero central es es %.2f", num1);
		} else if ((num2 > num1 && num2 < num3) || (num2 > num3 && num2 < num1)) {
			System.out.printf("El numero central es es %.2f", num2);
		} else {
			System.out.printf("El numero central es es %.2f", num3);
		} 

	}

}
