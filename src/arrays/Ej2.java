package arrays;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {		
		
		//Creo la variable tabla con la longitud para almacenar los valores.
		double tabla [] = new double [5];
		//Creo el Scanner
		Scanner sc = new Scanner (System.in);
		//Creo un bucle for que recorra toda la longitud de la tabla
		//Pido el número decimal al usuario y almaceno cada valor en cada 
		//posición de la tabla.
		for (int i=0; i<tabla.length; i++) {
			System.out.println("Ingrese un número decimal.");
			tabla[i] = sc.nextDouble();
		}
		//Creo un bucle for each para mostrar los valores de la tabla.
		for (double numero : tabla) {
			System.out.println(numero);
		}
		
		//Cierre del Scanner
		sc.close();
	}

}
