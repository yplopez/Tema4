package clasearray;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		//Creo variable de tipo entero para almacenar los valores
		//que ingrese el usuario
		int numero;
		
		//Creo la tabla 1 de tipo entero con una longitud de 10
		//para almacenar los primeros 10 números que ingrese el usuario.
		int tabla1[] = new int[10];
		
		//Creo la tabla 2 de tipo entero con una longitud de 10
		//para almacenar los ultimos 10 números que ingrese el usuario.
		int tabla2 [] = new int [10];
		
		//Creo el Scanner para ingreso de datos por teclado
		Scanner sc = new Scanner (System.in);
		
		for (int i=0; i<20; i++) {
			System.out.print("Introduce un número: ");
			numero = sc.nextInt();
			
			if (i < 10) {
				tabla1 [i] = numero;
			}else if (i < 21) {
				tabla2 [i - 10] = numero;
			}
		}
		
		if (Arrays.equals(tabla1, tabla2)) {
			System.out.println("Las tablas son iguales.");
		}else {
			System.out.println("Las tablas son diferentes.");
		}
		
		sc.close();
	}

}
