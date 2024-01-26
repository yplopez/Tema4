package clasearray;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		//Creo la variable para almacenar a los jugadores
		int jugador = 0;
		
		//Creo la variable para almacenar los puntajes
		int puntuacion = 0;
		
		//Creo la variable auxiliar que servirá de indice de la tabla
		int auxiliar;
		
		//Creo la tabla
		int tabla[] = new int [8];
		
		//Creo el Scanner para ingreso de datos
		Scanner sc = new Scanner(System.in);
		
		
		//Bucle for para pedir numeros hasta la longitud de la tabla y luego
		//se almacenan en ella.
		for (int i=0; i<tabla.length; i++) {
			do {
			System.out.print("Ingrese su puntaje: ");
			tabla[i] = sc.nextInt();	
			}while (puntuacion >= 1000 || puntuacion <= 2800);
		}	
		//Ordeno la tabla con la funcion sort de la clase array
		Arrays.sort(tabla);
		
		
		for (int i = tabla.length - 1; i >= 0 ; i--) {
            System.out.println(tabla[i]);
		}
		
		
		
		

	}


}
