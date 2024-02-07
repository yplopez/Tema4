package bidimensionales;

import java.util.Arrays;
import java.util.Random;

public class Ej5 {

	public static void main(String[] args) {
		// Creo una matriz de tipo entero para asignarle la tabla que retorna la
		// función rellenaTabla
		int tablaRellena[][] = new int[4][5];
		//Creo una variable acumuladora de tipo entero sumaFila para hacer las
		//sumas de los números de las filas.
		int sumaFila = 0;
		//Creo una variable acumuladora de tipo entero sumaColuma para hacer las
		//sumas de los números de las columnas.
		int sumaColumna = 0;
		//Creo una variable acumuladora de tipo entero sumaTotal para hacer las
		//sumas de los totales de las columnas
		int sumaTotal = 0;

		// Asigno a la matriz la tabla que rerorna la función rellenaTabla
		tablaRellena = rellenaTabla();

		// Creo un bucle for each para recorrer la tabla fila por fila
		// y hago uso del acumulador sumaFila para hacer la suma de los
		// números, las muestro por consola, y al finalizar asigno nuevamente a la variable sumaFila
		// el valor de cero.
		for (int[] fila : tablaRellena) {
			System.out.print(Arrays.toString (fila));
			for (int numero : fila) {
				sumaFila += numero;				
			}
			System.out.println(": " + sumaFila);
			sumaFila = 0;
		}
		
		//Creo un bucle for para recorrer la tabla, esta vez por columnas.
		//Hago uso del acumulador sumaColumnas para sumar los números de
		//las columnas de la tabla y las muestro por consola.
		//Hago la suma de los totales de cada columna para obtener el 
		//valor total y finalmente pongo el acumulador sumaColumna en cero.
		for (int j = 0; j <= tablaRellena.length; j++) {
			for (int i = 0; i < tablaRellena.length; i++) {
				sumaColumna += tablaRellena[i][j];
			}
			System.out.print(sumaColumna + ", ");			
			sumaTotal += sumaColumna;			
			sumaColumna = 0;
			
		}
		//Imprimo el valor del total de los sumatorios de las columnas
		System.out.println("Total: " + sumaTotal);

	}

	// Creo una funcion rellenaTabla de tipo entero que generá numeros aleatorios
	// en su interior y los devolvera al método main
	public static int[][] rellenaTabla() {
		// Creo una matriz de tipo entero y le asigno las longitudes
		int tabla[][] = new int[4][5];
		// Creo la clase random para generar números a
		Random rnd = new Random();

		// Hago un bucle for anidado para recorrer toda la matriz y asignarle
		// números aleatorios
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				tabla[i][j] = rnd.nextInt(100, 1000);
			}
		}
		//Retorno la tabla generada al metodo main donde sea llamada
		return tabla;
	}

}
