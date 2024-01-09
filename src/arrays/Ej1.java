package arrays;

import java.util.Random;

public class Ej1 {

	public static void main(String[] args) {
		//Creo la variable para almacenar los números aleatorios
		int numero;
		//Declaro la tabla de arrays y le asigno la longitud
		int tabla[] = new int [10];
		//Creo la clase random
		Random rnd = new Random();
		
		//Creo un bucle for que recorra toda la longitud del 
		//array, le asigno a la variable número la clase random
		//para asignar números aleatorios entre 1 y 100.
		//Finalmente, imprimo la variable número para ver por consola
		//los números.
		
		for (int i=0; i<tabla.length; i++) {
			numero = rnd.nextInt(100)+1;
			System.out.println(numero);
		}		

	}

}
