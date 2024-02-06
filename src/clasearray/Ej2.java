package clasearray;

import java.util.Arrays;

public class Ej2 {

	public static void main(String[] args) {
		//Creo la variable inicio de tipo entero para la posición donde se empieza la tabla
		int inicio = 0;
		
		//Creo la variable fin de tipo entero para indicar hasta donde va la tabla.
		int fin = 0;
		
		//Creo una tabla de tipo entero y le asigno una longitud
		int tabla[] = new int [55];
		
		//Creo un bucle de tipo for que asigna los números de 1 a 10
		//Y lo repite la misma cantidad de veces del valor del número.
		for (int i = 1; i <= 10; i++) {
			//Con cada iteración al valor de fin se le suma su propia cantidad 
			fin += i;
			
			//Con la función fill se rellena la tabla con la cantidad de veces de acuerdo 
			//al valor del número en cada iteración.
			Arrays.fill(tabla, inicio, fin, i);
			
			//
			inicio += i;
		}
		
		//Se imprimne la tabla
		System.out.println(Arrays.toString(tabla));

	}

}
