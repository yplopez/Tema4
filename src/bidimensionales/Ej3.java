package bidimensionales;

import java.util.Arrays;

public class Ej3 {

	public static void main(String[] args) {
		//Creo una matriz de tipo entero y le asigno longitud X, y longitud Y.
		int tabla[][] = new int [5][5];
		//LLamo a la fúnción matriz
		matriz(tabla);
		

	}//fin main	
	
	//Creo la función matriz y le paso como parámetro la tabla de tipo entero del main
	public static void matriz (int[][] tabla) {
		
		//Creo un bucle de tipo for para recorrer toda la tabla (filas y columnas, y 
		//le asigno la fórmula 10*n+m para que la rellene
		for(int n=0; n<tabla.length; n++) {
			for(int m=0; m<tabla.length; m++) {
				tabla[n][m] = (10*n)+m;
			}
		}
		//Imprimo la tabla
		System.out.println(Arrays.deepToString(tabla));
		
	}//fin matriz
}
