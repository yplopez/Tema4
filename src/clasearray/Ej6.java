package clasearray;

import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// creo la variable valor de tipo entero valor para pedir un número y comprobar
		// si
		// existe en el array y cuantas veces
		int valor;

		// Creo una variable contador de tipo entero para contar cuantas veces está
		// dentro del array
		int contador = 0;

		// creo una tabla de tipo entero con longitud de 1000
		int tabla[] = new int[1000];

		// Creo el Scanner para ingreso de datos
		Scanner sc = new Scanner(System.in);

		// Pido un valor al usuario
		System.out.println("Ingrese un valor numérico entre 0 y 99: ");

		// Almaceno el valor ingresado en la variable
		valor = sc.nextInt();

		// Creo un bucle for que recorre toda la tabla y le asigna un valor aleatorio
		// en cada espacio entre 0 y 99
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 100);
			//Hago un condiconal if para evaluar si el valor se encuantra y tras eso contar la cantidad 
			//de veces que esté el valor en el array
			if (tabla[i] == valor) {
				contador += 1;
			}
		}
		//Hago un condiconal if-else para evaluar si el contador es mayor a cero y con ello
		//mostrar por consola si está o no el valor y cuantas veces.
		if (contador > 0) {
			System.out.println("El valor si existe, y está " + contador + " vez / veces");
		}else {
			System.out.println("El valor no fue encontrado");
		}
		
		//cierro el scanner
		sc.close();

	}

}
