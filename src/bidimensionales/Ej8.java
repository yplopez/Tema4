package bidimensionales;

import java.util.Arrays;

public class Ej8 {

	public static void main(String[] args) {
		// Creo una matriz de tipo entero y le asigno valores
		int[][] matriz = { { 1, 2, 3 }, { 2, 4, 5 }, { 3, 5, 6 } };

		// Creo la variable booleana resultado, llamo a la función esSimétrica
		// y le paso la matriz como parámetro
		boolean resultado = esSimetrica(matriz);

		// Imprimo el valor booleano hallado en el resultado
		System.out.println(resultado);
	}

	// Creo la función esSimétrica de tipo booleano para retornar
	// si la tabla recibida por parámetro es simétrica o no.
	public static boolean esSimetrica(int matriz[][]) {

		// creo una variable de tipo booleano para almacenar el valor booleano
		// que determine la función
		boolean simetric = true;
		
		//Creo un bucle for anidado para recorrr toda la matriz y evaluo
		//en la variable simetric si cada valor en cada posición es simétrico
		//y además si la matriz tiene los valores idénticos en la posición
		//[i][j] que en la posición [j][i]
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				simetric = simetric && matriz[i][j] == matriz[j][i];
			}
		}
		
		//Retorno el valor que ha tomado la variable simetric a donde es 
		//llamada la función en el main.
		return simetric;
	}
}
