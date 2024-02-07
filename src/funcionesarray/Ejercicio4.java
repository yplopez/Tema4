package funcionesarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creo la variable clave de tipo entero para almacenar el número que
		// se va a buscar.
		int clave;

		// Creo la variable resultado de tipo entero para asignarle el valor que retorna
		// la función buscar
		int resultado;

		// Creo la tabla de tipo entero para almacenar los valores
		int tabla[] = new int[20];

		// Creo el Scanner para ingreso de datos
		Scanner sc = new Scanner(System.in);

		// Creo la clase random para generar numeros aleatorios
		Random rnd = new Random();

		// Creo un bucle for para rellenar con números aleatorios la tabla
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = rnd.nextInt(1, 101);
		}

		System.out.println(Arrays.toString(tabla));

		// Pido un número al usuario y lo almaceno en la variable clave
		System.out.println("Escribe el número que buscas: ");
		clave = sc.nextInt();

		// Asigno a la variable resultado el valor retornado por la función buscar
		resultado = Ejercicio4.buscar(tabla, clave);

		// Hago un condicional if else que en caso de encontrar la clave en la tabla
		// envia un mensaje con la posición de la ubicación, si no enviará un -1
		if (resultado != -1) {
			System.out.println("La posición del número dentro de la tabla es: " + resultado);
		} else
			System.out.println("No ha sido encontrado.");

		// Cierro el scanner
		sc.close();
	}
	

	// Creo la función buscar de tipo entero que tiene como parámetros de entrada
	// Un array de enteros y un entero, esta función retornará al main la posición
	// del número buscado si lo encuentra, si no, un mensaje predeterminado.
	public static int buscar(int t[], int clave) {
		// Creo la variable posición de tipo entero para almacenar la ubicación
		// del número que se busque.
		int indice = 0;
		// Creo un bucle while para evaluar y buscar la clave en la tabla.
		while (indice < t.length && clave != t[indice]) {
			indice++;
		}
		//Cuando el índice ha llegado al final de la tabla y no encontró la clave, el valor de índice será -1
		if (indice == t.length)
			indice = -1;
		
		//Retorno el índice a donde sea llamo en el método main
		return indice;

	}
}
