package bidimensionales;

import java.util.Arrays;
import java.util.Random;

public class Ej6 {

	public static void main(String[] args) {
		// Creo una matriz de tipo entero con longitud de 6 filas y 10 columnas
		int matriz[][] = new int[6][10];
		// Creo un array de tipo entero con longitud de dos para asignarle los
		// valores retornados por la función minimoMaximo
		int resultado[] = new int[2];

		// Creo la función random de la clase Math
		Random rnd = new Random();

		// Creo un bucle for anidado para recorrer toda la matriz (filas y
		// columnas) e ir asignándole valores aleatorios enteros positivos entre
		// cero y mil, incluidos.
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = rnd.nextInt(0, 1001);
			}
		}
		// Asigno a la variable resultado los valores retornados por la función
		// minimoMaximo
		resultado = minimoMaximo(matriz);

		// Imprimo por consola los valores retornados
		System.out.println(Arrays.toString(resultado));

	}// fin main

	//Creo una función minimoMaximo de tipo entero que recibe una matriz y
	//retorna un array con los valores mínimo y máximo de dicha matriz.
	public static int[] minimoMaximo(int[][] matriz) {

		// Creo un array de tipo entero con dos posiciones
		int minMax[] = new int[2];
		// Creo la variable mayor de tipo entero para almacenar el número mayor de
		// la matriz.
		int mayor = 0;
		// Creo la variable menor de tipo entero para almacenar el número menor de
		// la matriz.
		int menor = 0;

		// Le asigno a la variable mayor el valor de la posición 0,0 de la matriz.
		mayor = matriz[0][0];
		// Le asigno a la variable menor el valor de la posición 0,0 de la matriz.
		menor = matriz[0][0];

		// Creo un bucle for anidado para recorrer toda la matriz (filas y columnas),
		// y evaluo si los valores de la matriz son mayor o menor que la variable menor
		// y mayor asignadas anteriormente, finalmente en cada condicional if asigno a
		// las
		// variable menor y mayor el número correspondiente.
		for (int i = 0; i < minMax.length; i++) {
			for (int j = 0; j < minMax.length; j++) {
				if (matriz[i][j] < menor) {
					menor = matriz[i][j];
				}
				if (matriz[i][j] > mayor) {
					mayor = matriz[i][j];
				}
			}
		}
		// Asigno a la posición 0 del array minMax el valor del número menor
		// de la matriz.
		minMax[0] = menor;
		// Asigno a la posición 1 del array minMax el valor del número mayor
		// de la matriz.
		minMax[1] = mayor;
		//Retorno el array minMax al metodo main donde sea llamado.
		return minMax;
	}

}
