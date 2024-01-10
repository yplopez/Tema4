package arrays;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		//Creo la variable tabla y le asigno la longitud para almacenar datos.
		int tabla[]= new int[10];
		//Creo el Scanner
		Scanner sc = new Scanner (System.in);
		//Creo un bucle for para leer por teclado 10 números y almacenarlos
		//en la tabla.
		for(int i=0; i<tabla.length; i++) {
			System.out.print("Escribe 10 números: ");
			tabla[i] = sc.nextInt();
		}
		//Creo un bucle for para mostrar en consola los datos de formas inversa.
		for (int i=tabla.length-1; i>=0; i--) {
			System.out.print(tabla[i]);
		}
		

	}

}
