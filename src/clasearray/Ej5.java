package clasearray;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
					
		//Creo la tabla de tipo entero con una longitud de 8
		int tabla[] = new int [8];
		
		//Creo el Scanner para ingreso de datos
		Scanner sc = new Scanner(System.in);
		
		
		//Bucle for para pedir numeros hasta la longitud de la tabla y luego
		//se almacenan en ella.
		for (int i=0; i<tabla.length; i++) {
			//Bucle do-while que pide el puntaje de los jugadores y condiciona el rango de la puntuación entre mil y 2800
			do {
			System.out.print("Ingrese su puntaje: ");
			tabla[i] = sc.nextInt();	
			}while (tabla[i] < 1000 || tabla[i] > 2800);
		}	
		//Ordeno la tabla con la funcion sort de la clase array
		Arrays.sort(tabla);
		
		//Bucle for que imprime en orden descendente la puntuacion almacenada en la tabla
		for (int i = tabla.length - 1; i >= 0 ; i--) {
            System.out.print(tabla[i] + "\t");
		}
		
		//cierre del scanner
		sc.close();
		
		

	}


}
