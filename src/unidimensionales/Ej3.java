package unidimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		// Creo una variable de tipo entero para almacenara posición
		int posicion;

		// creo una variable de tipo entero para almacenar la intensidad
		int intensidad;

		// Creo la variable aux de tipo entero para manejar el decremento de la
		// intensidad
		int aux;

		// Creo un array de tipo entero y le asigno una longitud de 12 posiciones
		int rio[] = new int[12];

		// Creo el scanner para ingreso de datos
		Scanner sc = new Scanner(System.in);

		// Pido la posición de la piedra al jugador
		System.out.println("Ingrese un número menor a 11: ");

		// Almaceno el valor ingresado en la variable posición
		posicion = sc.nextInt();

		// Pido la intensidad de la piedra
		System.out.println("Ingrese con que intensidad va a lanzar la piedra en una escala de 1 a 5: ");

		// Almaceno la intensidad ingresada en la variable intensidad
		intensidad = sc.nextInt();

		// Asigno al array en la posición el valor de la intensidad
		rio[posicion] = intensidad;

		// Asigno la formula para decrementar la intensidad de la piedra
		aux = intensidad - 1;

		// Creo un bcucle for para recorrer el array desde la posición donde fue
		// arrojada la
		// piedra hasta el final del array, le asigno al array el valor actual del
		// auxiliar
		// y mediante un if evaluo que cuando el decremento llegue a cero, se mantenga
		// en cero.
		for (int i = posicion + 1; i < rio.length; i++) {
			rio[i] = aux;
			if (aux >= 0) {
				aux--;
			}
		}

		// Asigno nuevamente la formula para decrementar la intensidad de la piedra,
		// porque al terminar el for anterior aux valia cero.
		aux = intensidad - 1;

		for (int i = posicion - 1; i>=0; i--) {
			rio[i] = aux;
			if (aux >0) {
				aux--;
			}
		}

		System.out.println(Arrays.toString(rio));

		sc.close();

	}

}
