package bidimensionales;

import java.util.Arrays;

public class Ej10 {

	public static void main(String[] args) {
		// Creo una matriz de tipo entero y le asigno la misma longitud en
		// filas y columnas
		int tablaInicio[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		// Creo la variable transforTabla para asignarle la función gira90
		int[][] transforTabla = new int[4][4];

		// Asigno la función a la variable
		transforTabla = gira90(tablaInicio);
		
		//Muestro en pantalla la tabla girada a 90°
		System.out.println(Arrays.deepToString(transforTabla));

	}

	// Creo la función gira90 de tipo entero que recibe una matriz del método
	// principal y devuelve dicha matriz girada a 90°
	public static int[][] gira90(int tablaInicio[][]) {
		
		//Creo una tabla de tipo entero con la misma longitud en filas y columnas
		//de la tabla recibida.
		int [][] tablaGirada = new int[4][4];
		
		//Creo una variable auxiliar para manejar las columnas de la matriz tablaGirada
		int k=0;
		
		//Creo un bucle for anidado , el for externo recorre la matriz de principio 
		//a fin y el for interno la recorre al contrario.
		//Asigno a la matriz vacía en la posición i(filas) y k(columnas), los
		//valores de la tablaInicio en columnas y filas.
		//La variable k se comporta como una "j" y en cada iteración va aumentando
		//su posición, pero al terminar cada fila se inicializa a cero
		//quedando lista para recorrer la siguiente fila.
		for(int i=0; i<tablaInicio.length; i++) {
			for(int j=tablaInicio.length-1; j>=0; j--) {
				tablaGirada [i][k] = tablaInicio [j][i];
				k++;
			}
			k=0;
		}
		
		//Retorno la nueva tabla generada tablaGirada al método main donde es llamada
		return tablaGirada;
	}
}
