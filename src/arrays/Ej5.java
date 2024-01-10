package arrays;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		//Creo un array con la variable tabla y longitud 10.
		int tabla[] = new int [10];
		//Creo una variable acumulador para sumar los valores del array.
		int acumulador = 0;
		//Creo una variable max para evaluar el valor máximo del array.
		int max = Integer.MIN_VALUE;
		//Creo una variable min para evaluar el valor mínimo del array.
		int min = Integer.MAX_VALUE;
		//Creo el Scanner para ingreso de datos por teclado
		Scanner sc = new Scanner (System.in);
		
		
		for (int i=0; i<tabla.length; i++) {
			System.out.print("Ingrese un número: ");
			tabla[i] = sc.nextInt();			
		}		
		
		
		for (int i=0; i<tabla.length; i++) {
			acumulador = acumulador + tabla[i];
			
			if (tabla[i]>max) {
				max = tabla[i];
			}
			if (tabla[i]<min) {
				min = tabla[i];
			}
		}
		
		System.out.println("La suma de todos los valores es: " + acumulador);
		
		System.out.println("El número máximo es: " + max);
		
		System.out.println("El número mínimo es: " + min);
		

	}

}
