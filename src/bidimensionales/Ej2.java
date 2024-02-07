package bidimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		// Creo una matriz de tipo entero y le asigno las longitudes de filas y columnas
		String matriz[][] = new String[4][6];
		// Creo la variable mánimo de tipo entero para almacenar la nota mínima
		int minimo = 0;
		// Creo la variable máximo de tipo entero para almacenar la nota máxima
		int maximo = 0;
		// Creo la variable promedio de tipo entero para almacenar el resultado de
		// la fórmula para hallar el promedio
		int promedio = 0;
		// Creo la variable suma para acumular la suma de los valores ingresados
		int suma = 0;

		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Creo un bucle for para recorrer toda la matriz, inicialmente las filas,
		//seguido de las columnas e ir pidiendo las notas a cada alumno y las almacena
		//en la matriz.
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 5; j++) {
				if (j == 0) {
					matriz[i][j] = "Alumno " + (i + 1) + ":";
				} else {
					System.out.println("Ingrese la nota " + (j) + " para alumno " + (i + 1));
					matriz[i][j] = sc.nextLine();
				}
			}			
		}
		//Imprimo la matriz
		
		System.out.println(Arrays.deepToString(matriz));
		//Cierro el Scanner
		sc.close();
		
		//Hago un bucle for para recorrer la matriz y encontrar la nota mínima, máxima y
		//el promedio de cada alumno
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 5; j++) {
				//En la variable suma voy acumulando las notas de cada alumno para
				//Almacenarlas, hago uso del metodo int de la clase integer para
				//transformar un String a un entero.
				suma += Integer.parseInt(matriz[i][j]);
				//Evaluo la primera nota de la matriz y entonces se convertirá en la nota 
				//mínima y máxima de la matriz para comparar con las siguientes notas.				
				if (j == 1) {
					minimo = Integer.parseInt(matriz[i][j]);
					maximo = Integer.parseInt(matriz[i][j]);
				} else {
					if (Integer.parseInt(matriz[i][j]) < minimo) {
						minimo = Integer.parseInt(matriz[i][j]);
					}
					if (Integer.parseInt(matriz[i][j]) > maximo) {
						maximo = Integer.parseInt(matriz[i][j]);
					}
				}
				//Hago la fórmula para hallar el promedio de las notas
				promedio = suma / 5;

			}
			//Muestro por consola la información solicitada por cada alumno: nota mínima, 
			//nota máxima y promedio.
			System.out.println("La nota mínima del Alumno " + (i+1) + " es: " + minimo);
			System.out.println("La nota máxima del Alumno " + (i+1) + " es: " + maximo);
			System.out.println("El promedio del Alumno " + (i+1) + " es: " + promedio);
		}
	}

}
