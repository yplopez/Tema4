package unidimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// Creo un array de tipo entero con una longitud de 10 y le asigno valores
		int panel[] = { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 };

		// Creo una variable de tipo entero para almacenar el numero ingresado por el
		// jugador
		int posicion;

		// creo el scanner para ingreso de datos
		Scanner sc = new Scanner(System.in);

		// Pido un número al jugador
		System.out.println("Adivina a dónde está la mosca, escribe un numero de 0 a 9: ");

		// Almaceno el valor ingresado
		posicion = sc.nextInt();

		buscaMosca(panel, posicion);

		// cierro el scanner
		sc.close();
	}

	// Creo la función buscaMosca de tipo entero que recibe como parámetros un array
	// y
	// un número.
	public static void buscaMosca(int t[], int numero) {

		// Creo la variable de tipo entero numAleatorio para asignarle un número
		// aleatorio.
		int numAleatorio;

		// Creo la variable auxiliar de tipo entero que alojará el valor de la ubicación
		// de
		// la mosca , mientras se genera una nueva ubicación, entonces posicionará el
		// valor
		// en esa posición y recogerá el valor que contenía la nueva posición y lo
		// almacenará
		// en la posición donde se encontraba la mosca.
		int aux;

		// Creo un condicional if para evaluar si el jugador a acertado o no la
		// ubicación de la mosca y devuelve un mensaje con
		if (t[numero] == 1) {
			System.out.println("La has encontrado!");
		} else {
			System.out.println("Sigue intentando.");

			// Si no ha adivinado, pero la mosca está en la posición anterior al número
			// ingresado, se generará una nueva ubicación aleatoria con las funciones de la
			// clase Math, ésta nueva ubicación será donde se encuentre la mosca y el la
			// posición
			// donde se encontraba la mosca se rellenará con el cero de la nueva posición,
			// intercambiando valores.

			if (t[numero - 1] == 1) {
				numAleatorio = (int) Math.floor(Math.random() * 10 + 1);
				aux = t[numero - 1];
				t[numero - 1] = t[numAleatorio];
				t[numAleatorio] = aux;
				System.out.println(Arrays.toString(t));// dejo este syso para ver el movimiento de la mosca
			}

			// Si no ha adivinado, pero la mosca está en la posición posterior al número
			// ingresado, se generará una nueva ubicación aleatoria con las funciones de la
			// clase Math, ésta nueva ubicación será donde se encuentre la mosca y el la
			// posición
			// donde se encontraba la mosca se rellenará con el cero de la nueva posición,
			// intercambiando valores.

			if (t[numero + 1] == 1) {
				numAleatorio = (int) Math.floor(Math.random() * 10 + 1);
				aux = t[numero + 1];
				t[numero + 1] = t[numAleatorio];
				t[numAleatorio] = aux;
				System.out.println(Arrays.toString(t));// dejo este syso para ver el movimiento de la mosca
			}
		}

	}
}
