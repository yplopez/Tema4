package arrays;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		//Creo un array de tipo entero con una longitud de 12
		int temperatura [] = new int [12];
		
		//Creo el scanner para ingreso de datos por teclado
		Scanner sc = new Scanner(System.in);
		
		//Creo un array llamado meses de tipo String al cual le añado los nombre de los meses del año
		String meses[] = {"Enero     ", "Febrero   ", "Marzo     ", "Abril     ", "Mayo      ", "Junio     ", "Julio     ", "Agosto    ", "Septiembre", "Octubre   ", "Noviembre ", "Diciembre "};
		
		//Creo un bucle for que recorrerá toda la longitud del array, mientras ello sucede
		//pide la temperatura promedio de cada mes y almacena dicho valor en cada índice del array.
		for (int i=0; i<temperatura.length; i++) {
			System.out.print("Ingrese la temperatura promedio de:  " + meses[i] + "  ");
			temperatura[i] = sc.nextInt();
		}
		//Creo un bucle for para rrecorrer de nuevo todo el array, mostrar cada uno de los meses con
		//el promedio de temperatura de cada mes.
		for (int i=0; i<temperatura.length; i++) {

			System.out.print(meses[i]);
			System.out.println(temperatura[i] + "º");

			//Creo un bucle for para recorrer el array de de acuerdo al valor encontrado en ada índice
			//grafique con asteriscos la temperatura encontrada
			for (int j=0; j<temperatura[i]; j++) {				
				System.out.print("*");
			}
			System.out.println();
		}
		//cierro el scanner
		sc.close();
	}

}
