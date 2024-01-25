package clasearray;

import java.util.Arrays;
import java.util.Random;

public class Ej4 {

	public static void main(String[] args) {
		//Creo la variable número para almacenar los números aleatorios
		int numero;
		
		//Crero una tabla y le asigno la longitud
		int tabla [] = new int [30];
		
		//Hago un bucle for de la longitud de la tabla, se generará un número
		//aleatorio para cada espacio y se almacenará.
		for (int i=1; i < tabla.length; i++) {
			numero = (int) (Math.random()*10);
			tabla[i] = numero;
		}
		//Uso la función sorts de la clase arrays para ordenar los valores
		//de la tabla de menor a mayor.
		Arrays.sort(tabla);
		
		//Imprimo la tabla usando la funcion to.String de la clase arrays
		System.out.println(Arrays.toString(tabla));
		
		
		

	}

}
