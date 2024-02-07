package funcionesarray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creo la variable elemento para almacenar el número con el que se agruparan
		// los números del array
		int numElementos;

		// Creo un array con algunos valores
		int tabla[] = { 10, 1, 5, 8, 9, 2 };

		// Creo el Scanner para pedir datos por teclado
		Scanner sc = new Scanner(System.in);

		// Pido información al usuario
		System.out.println("Escriba cuantos números quiere agrupar del array: ");

		// Almaceno el valor en la variable numElementos
		numElementos = sc.nextInt();

		// Creo una nueva tabla de tipo entero para almacenar los valores retornados
		// por la función suma
		int nuevaTabla[] = suma(tabla, numElementos);
		
		//Muestro el nuevo array con los resultados
		System.out.println(Arrays.toString(nuevaTabla));
		
		//cierro el scanner
		sc.close();

	}
	//Creo la función suma de tipo entero, recibe como parámetros un array y un valor pedido,
	//finalmemnte retorna un array con los sumatorios de las agrupaciones realizadas.
	public static int[] suma(int t[], int numElementos) {
		
		//Creo un array y le asigno la fórmula para determinar que longitud va a tener.
		int tablaSuma[] = new int[t.length - numElementos + 1];
		
		//Creo un bucle for anidado. El for externo recorre toda la longitud de la tabla, y el for
		//interno de acuerdo al numero de elementos que se haya pasado, acumula en esta tabla
		//la sumatoria de los grupos de números.
		for (int i = 0; i < tablaSuma.length; i++) {
			for (int j=i; j<i+numElementos; j++) {
				tablaSuma[i] += t[j];
			}
		}
		
		//Retorno al metodo main la nueva tabla donde sea llamada.
		return tablaSuma;
	}

}
