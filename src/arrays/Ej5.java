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
		
		//Bucle for para pedir numeros hasta la longitud de la tabla y luego
		//se almacenan en ella.
		for (int i=0; i<tabla.length; i++) {
			System.out.print("Ingrese un número: ");
			tabla[i] = sc.nextInt();			
		}		
		
		//Bucle for para hacer la suma de los números ingresados y un condicional
		//de tipo if para encontrar los valores mínimo y máximod de la tabla.
		for (int i=0; i<tabla.length; i++) {
			acumulador = acumulador + tabla[i];
			
			if (tabla[i]>max) {
				max = tabla[i];
			}
			if (tabla[i]<min) {
				min = tabla[i];
			}
		}
		//Impresion de la suma de los números del array.
		System.out.println("La suma de todos los valores es: " + acumulador);
		//Impresión del número máximo.
		System.out.println("El número máximo es: " + max);
		//Impresión del número mínimo.
		System.out.println("El número mínimo es: " + min);
		
		//cierre del Scanner
		sc.close();
		

	}

}
