package arrays;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		
		int temperatura [] = new int [12];
		
		
		Scanner sc = new Scanner(System.in);
		
		String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		for (int i=0; i<temperatura.length; i++) {
			System.out.print("Ingrese la temperatura promedio de:  " + meses[i] + "  ");
			temperatura[i] = sc.nextInt();
		}
		
		for (int i=0; i<temperatura.length; i++) {
			System.out.println(meses[i]);
			System.out.println(temperatura[i] + "º");
			for (int j=0; j<temperatura[i]; j++) {				
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
