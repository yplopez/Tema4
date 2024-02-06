package arrays;

import java.util.Arrays;
import java.util.Random;

public class Ej8 {

	public static void main(String[] args) {
		//Creo la variable aleatorio de tipo entero
		int aleatorio;
		//Creo una tabla y le asigno una longitud de 100
		int tabla [] = new int [100];
		//Creo un bucle for que recorrerá toda la tabla y le irá añadiendo un valor aleatorio
		//a cada índice con números de 1 a 10, utilizando la función Match.random
		for(int i=0; i<tabla.length; i++) {
			aleatorio = (int) (1 + Math.random()*10);
			tabla[i] = aleatorio;
		}
		//Muestro la tabla generada
		System.out.println(Arrays.toString(tabla));
		
		

	}

}
