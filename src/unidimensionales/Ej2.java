package unidimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		// Creo un array de longitud par con parejas de números
		String panel[] = { "2", "5", "7", "8", "1", "2", "5", "7", "8", "1" };

		// Creo un array de la misma longitud que se mostrará relleno de asteriscos
		String oculto[] = { "*", "*", "*", "*", "*", "*", "*", "*", "*", "*" };

		// Creo una variable num1 de tipo entero para almacenar el primer número
		int num1;

		// Creo una variable num2 de tipo entero para almacenar el segundo número
		int num2;

		// Creo el scanner para ingreso de datos
		Scanner sc = new Scanner(System.in);

		// Pido el primer número al jugador y lo almaceno en la variable num1
		System.out.println("Juguemos parejas con numeros del 0 al 9!!!");
		System.out.println("Ingrese el primer número: ");
		num1 = sc.nextInt();

		// Pido el segundo número al jugador y lo almaceno en la variable num2
		System.out.println("Ingrese el segundo número: ");
		num2 = sc.nextInt();

		// Hago un condicional if else que evalua si los números ingresados resultan ser
		// parejas.
		// en caso de que lo sean hará visibles los valores contenidos en esas
		// posiciones.
		if (panel[num1] == panel[num2]) {

			oculto[num1] = panel[num1];
			oculto[num2] = panel[num2];
			System.out.println(Arrays.toString(oculto));
			// Si no coinciden los valores ingresados contenidos en las posiciones, los
			// mostrará y despues los ocultará.
		} else {

			oculto[num1] = panel[num1];
			oculto[num2] = panel[num2];
			System.out.println(Arrays.toString(oculto));

			oculto[num1] = "*";
			oculto[num2] = "*";
			System.out.println(Arrays.toString(oculto));
		}

	}

}
