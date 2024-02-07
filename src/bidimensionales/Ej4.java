package bidimensionales;

import java.util.Arrays;

public class Ej4 {

	public static void main(String[] args) {
		//Creo una matriz con longitud de 10 en X y en Y
		int matriz [][] = new int [10][10];
		
		//creo la variable resultado para asignarle lo que retorna el método
		int [][] resultado;
		
		resultado = tablaMultiplicar(matriz);
		
		System.out.println(Arrays.deepToString(resultado));
		
		
		

	}//fin main
	
	
	public static int[][] tablaMultiplicar (int [][] matriz) {
		
		for(int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz.length; j++) {
				matriz [i][j] = (i+1) * (j+1);
			}
		}
		
		
		return matriz;
		
	}
	

}
