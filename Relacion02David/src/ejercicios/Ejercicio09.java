package ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		/*
		 * Dado el sueldo bruto de un trabajador y su número de hijos, realizar un algoritmo que calcule los impuestos que debe pagar según la siguiente tabla de tramos:
			Tramo
			Impuesto (%)
			Descuento
			0 a 1000
			0
			No aplicable
			1000 a 1600
			5
			1% por hijo (máximo 5%)
			1600 a 3000
			10
			1% por hijo (máximo 10%)
			3000 a 4600
			15
			1% por hijo (máximo 10%)
			> 4600
			20
			1.5% por hijo (máximo 15%)
		 */
		System.out.println("CAlculo de los impuestos del trabajador");
		System.out.println("Sueldo:");
		double sueldo = teclado.nextDouble();
		double impuestos, descuento, neto, porcentajeDescuento;
		impuestos = descuento= neto = porcentajeDescuento=0;
		
		System.out.println("Núm. Hijos:");
		int nHijos = teclado.nextInt();
		
		if (sueldo < 1000) {
			neto=sueldo;
		} else if (sueldo <1600 ) {
			impuestos = sueldo * 0.05;
			// opcion 1
			porcentajeDescuento = 0.01 * nHijos;
			if (porcentajeDescuento>0.05) {
				porcentajeDescuento=0.05;
			}
			//opcion 2
//			porcentajeDescuento = Math.min(0.05, 0.01*nHijos);
			
			// opcion 3
//			if (nHijos<5) {
//				porcentajeDescuento=nHijos*0.01;
//			} else {
//				porcentajeDescuento=0.05;
//			}
			
		} else if(sueldo <3000 ) {
			impuestos = sueldo * 0.1;
			porcentajeDescuento = 0.01 * nHijos;
			if (porcentajeDescuento>0.1) {
				porcentajeDescuento=0.1;
			}
		} else if (sueldo <4600) {
			impuestos = sueldo * 0.15;
			porcentajeDescuento = 0.01 * nHijos;
			if (porcentajeDescuento>0.1) {
				porcentajeDescuento=0.1;
			}
		} else {
			impuestos = sueldo * 0.2;
			porcentajeDescuento = 0.01 * nHijos;
			if (porcentajeDescuento>0.15) {
				porcentajeDescuento=0.15;
			}
		}
		
		descuento = sueldo* porcentajeDescuento;
		neto = sueldo - impuestos + descuento;
		System.out.printf("sueldo bruto: %.2f, Impuestos:%.2f,"
				+ " descuentos:%.2f, salario neto: %.2f\n", sueldo, impuestos,
				descuento, neto);
		System.out.printf("Total a impuestos a pagar %.2f", impuestos-descuento);
		
	}
}
