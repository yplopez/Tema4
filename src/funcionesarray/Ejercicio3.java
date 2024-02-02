package funcionesarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		//creo la variable longitud para almacenar la que indique el ususario
		int longitud;
		//Creo la variable fin para almacenar hasta que número se generarán los numeros
		//pares aleatorios
		int fin;
		//Creo el scanner para ingreso de datos por teclado
		Scanner sc = new Scanner(System.in);		
		//Pido al usuario la longitud de la tabla
		System.out.println("Ingrese la longitud de la tabla: ");
		//Almaceno el valor de la longitud en la variable
		longitud = sc.nextInt();

		//Pido al usuario el número hasta donde quiere generar los números pares
		System.out.println("Ingrese el número límite hasta el que quiere generar números pares: ");
		//Almaceno el valor límite en la varible fin
		fin = sc.nextInt();
		//Muestro por consola el array que arroja el programa
		System.out.println(Arrays.toString(rellenaPares(longitud, fin)));
		
		
	}

	// Creo la función rellena pares de tipo entero que retornará
	// la tabla
	public static int[] rellenaPares(int longitud, int fin) {
		// Creo la tabla
		int table[] = new int[longitud];
		// Creo la clase random para rellenar de números aleatorioa la tabla
		Random rnd = new Random();
		// Creo un bucle for each que recorra toda la tabla y un do-while dentro
		// para asignar valores pares de acuerdo al valor ingresado.
		for (int i=0; i<table.length; i++) {
			do {
				table[i] = rnd.nextInt(2, fin);
			} while (table[i] % 2 != 0);
		}
		// Retorno la tabla al metodo main
		return table;
	}

}
