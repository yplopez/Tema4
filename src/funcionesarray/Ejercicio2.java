package funcionesarray;

public class Ejercicio2 {
	// Creo el método main para comprobar el funcionamiento de la
	// función.
	public static void main(String[] args) {
		// creo una tabla y le asigno valores de tipo entero
		int tabla[] = { 5, 10, 15, 20 };
		// Creo la variable valorMaximo y le asigno el valor retornado
		// por la función maximo
		int valorMaximo = Ejercicio2.maximo(tabla);
		// Muestro en consola el valor máximo del array
		System.out.println("El número máximo es: " + valorMaximo);
	}

	// Creo la función Tabla de tipo integer que retorna el valor máximo
	// de los número contenidos en la tabla
	public static int maximo(int[] tabla) {

		// Creo la variable máximo de tipo entero para almacenar el dato de mayor valor
		// y lo retorno a la clase main
		int maximo = 0;
		// Hago un buche for each para recorrer todo los datos de la tabla
		for (int valor : tabla) {
			//Hago un bucle for para recorrer la tabla en cada uno de sus índices
			for (int i = 1; i < tabla.length - 1; i++) {
				//Creo una condición if para evaluar cual era el valor máximo de los
				//y le asigno a la variable máximo el valor del numero mayor.
				if (valor > tabla[i]) {
					maximo = valor;
				}
			}
		}
		return maximo;

	}

}
