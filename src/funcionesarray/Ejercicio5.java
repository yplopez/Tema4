package funcionesarray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// creo una tabla de tipo entero y le asigno valores
		int tabla[] = { 1, 2, 3, 4, 8, 7, 3, 5, 3 };
		// creo una variable de tipo entero para almacenar un valor ingresado
		int numero;
		// Creo la variable resultado de tipo entero para asignar el valor que retorna
		// la función buscarTodos
		int resultado[];

		// Creo el Scanner para ingreso de datos
		Scanner sc = new Scanner(System.in);

		// Pido al usuario que ingrese un número
		System.out.println("Ingrese un número de 1 a 9: ");

		// Almaceno el valor ingresado en la variable número
		numero = sc.nextInt();

		// Asigno a la variable resultado lo que retorna la función buscarTodos
		resultado = buscarTodos(tabla, numero);

		// Imprimo el array retornado
		System.out.println(Arrays.toString(resultado));
		
		//Cierre de scanner
		sc.close();

	}

	//Creo la función buscarTodos de tipo entero con dos parámetros de entrada
	//que retornara un nuevo array al metodo main
	public static int[] buscarTodos(int t[], int valor) {
		//Creo la variable cuenta y la inicializo en cero para contar las coincidencias encontradas
		int cuenta = 0;
		//creo la variable posición, la inicializo en cero, para almacenar el indice del valor
		//encontrado en la nueva  tabla
		int posicion = 0;
		
		//Hago un bucle for que recorra el array del parámetro y vaya comparando el valor ingresado
		//con el valor de cada elemento del array y además va incrementando en 1 el valor del contador
		for (int i = 1; i < t.length; i++) {
			if (t[i] == valor) {
				cuenta += 1;
			}
		}
		//Creo una nueva tabla y le asigno la cantidad de elementos encontrados por el contador cuenta.
		int[] tabla = new int[cuenta];
		
		//Creo un bucle for que recorre la tabla que llega por parámetro y evalua si el valor ingresado 
		//por parámetro coincide con el valor de cada índice de la tabla.
		//Si coincide, se añade un nuevo elemento a la nueva tabla con el índice de t[] y se incrementa
		//la variable posición para posicionarse en el siguiente índice en la nueva tabla.
		for (int i = 0; i < t.length; i++) {
			if (t[i] == valor) {
				
				//Si coincide, se añade un nuevo elemento a la nueva tabla con el índice de t[] y se incrementa
				//la variable posición para posicionarse en el siguiente índice en la nueva tabla.
				tabla[posicion] = i;
				posicion += 1;

			}
		}
		//Retorno la nueva tabla a donde sea llamada en el método main.
		return tabla;
	}

}
