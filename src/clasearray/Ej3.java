package clasearray;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		//Creo variable de tipo entero para almacenar los valores
		//que ingrese el usuario
		int numero;
		
		//Creo la tabla 1 de tipo entero con una longitud de 10
		//para almacenar los primeros 10 números que ingrese el usuario.
		int tabla1[] = new int[10];
		
		//Creo la tabla 2 de tipo entero con una longitud de 10
		//para almacenar los ultimos 10 números que ingrese el usuario.
		int tabla2 [] = new int [10];
		
		//Creo el Scanner para ingreso de datos por teclado
		Scanner sc = new Scanner (System.in);
		
		//Creo un bucle for para asignarle para pedir los datos de dos tablas y los almaceno
		//en la variable número
		for (int i=0; i<20; i++) {
			System.out.print("Introduce un número: ");
			numero = sc.nextInt();
			
			//Hago una condicional para almacenar los primeros 10 números en la tabla 1 y
			//los siguientes 10 en la tablados
			if (i < 10) {
				tabla1 [i] = numero;
			}else if (i < 21) {
				tabla2 [i - 10] = numero;
			}
		}
		//Despues de ser almacenados los números en cada tabla, se evalúa mediante la función equals
		//si las tablas son iguales o no.
		if (Arrays.equals(tabla1, tabla2)) {
			System.out.println("Las tablas son iguales.");
		}else {
			System.out.println("Las tablas son diferentes.");
		}
		//Cierre del scanner
		sc.close();
	}

}
