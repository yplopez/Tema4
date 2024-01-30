package funcionesarray;

import java.util.Arrays;

public class Ejercicio1 {
	public static void main(String[] args) {

		// Creo una tabla con valores de tipo entero
		int tabla[] = { 5, 10, 20, 15, 30 };

		// creo la variable resultado y le asigno el valor retornado
		// por el método suma
		int resultado = Ejercicio1.suma(tabla);

		// Imprimo el array y la suma de éste
		System.out.println(Arrays.toString(tabla));
		System.out.println("El resultado dela suma de los valores de la tabla es: " + resultado);
	}

	// Función de tipo entero que retorna la suma de los valores
	public static int suma(int[] tabla) {

		// Creo la variable suma de tipo entero para acumular la suma de los
		// valores de la tabla
		int suma = 0;
		// Creo un bucle for each para recorrer toda la tabla y sumar sus valores
		for (int valor : tabla) {
			suma += valor;
		}
		return suma;
	}

}
