package clasearray;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		//Creo la variable N de tipo entero para almacenar el tamaño del array
		int N;
		//Creo la variable M de tipo entero para almacenar el contenido del array
		int M;
		
		//Creo el Scanner para ingreso de datos
		Scanner sc = new Scanner (System.in);
		
		//Pido al usuario el tamaño de la tabla y lo almaceno en la variable N
		System.out.print("Ingrese el tamaño de la tabla: ");
		N = sc.nextInt();
		
		//Pido al usuario el valor del contenido de la tabla y lo almaceno en la variable M
		System.out.print
		("Ingrese el valor para el contenido de la tabla");
		M = sc.nextInt();
		
		//Creo una tabla de tipo int y le asigno la variable N para que tome el tamaño que ingrese el usuario
		int tabla[] = new int [N];
		
		//Declaro la clase fill para rellenar con el valor que ingrese el usuario toda la tabla
		Arrays.fill(tabla, M);
		
		//Imprimo la tabla con el tamalo y valor ingresado por el usuario
		System.out.println(Arrays.toString(tabla));
		
		
		
		

	}

}
