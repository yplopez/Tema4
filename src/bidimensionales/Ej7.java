package bidimensionales;

import java.util.Arrays;

public class Ej7 {

	public static void main(String[] args) {
		// Creo una matriz de tipo entero y le asigno los valores.
		int[][] matriz1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		
		// Creo una matriz de tipo entero con la misma longitud de matriz2 para
		//asignarle la matriz retornada por la función transposición
		int matrizNueva[][] = new int [4][4];
		
		//Le asigno a la matrizNueva la matriz retornada por la función transposicion
		matrizNueva = transposicion(matriz1);
		
		//Muestro por pantalla la matriz transposicionada
		System.out.println(Arrays.deepToString(matrizNueva));

	}
	//Creo una función de tipo entero que recibe una matriz y retorna
	//al método main.
	public static int[][] transposicion(int[][] matriz1) {

		// Creo una matriz de tipo entero vacía.
		int matriz2[][] = new int[4][4];
		
		//Creo un for anidado para recorrer toda la matriz (filas y columnas)
		//y asigno a la matriz2, los valores de matriz1 de tal manera que lo que
		//encuentre en las filas, lo ponga en las columnas y viceverza.
		for(int i=0; i<matriz1.length; i++) {
			for(int j=0; j<matriz1.length; j++) {
				matriz2[j][i] = matriz1[i][j];
			}
		}
		
		//Retorno la matriz2 a la variable donde es llamada la función
		//transposición
		return matriz2;
	}

}
