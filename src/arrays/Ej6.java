package arrays;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		//Creo una tabla de tipo entero y le asigno una longitud de 8 
		int tabla [] = new int [8];
		//Creo el Scanner para ingreso de datos por teclado
		Scanner sc = new Scanner (System.in);
		//Creo un bucle for que permite recorrero la longitud del array, pide un número
		//y se lo asigna a cada posición del array.
		for (int i=0; i<tabla.length; i++) {
			System.out.print("Ingrese un número: ");
			tabla[i] = sc.nextInt();
		}
		//Creo un bucle que recorre toda la tabla y evalua cada dato ingresado para saber si es un 
		//número par o no y envia el mensaje de acuerdo al resuldo de la evaluación.
		for (int i=0; i<tabla.length; i++) {
			if(tabla[i]%2==0) {
				System.out.println("Es par");
			}else {
				System.out.println("Es impar");
			}
		}
		//Cierro el scanner
		sc.close();
		
		

	}

}
