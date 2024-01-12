package arrays;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		
		int tabla [] = new int [8];
		
		Scanner sc = new Scanner (System.in);
		
		for (int i=0; i<tabla.length; i++) {
			System.out.print("Ingrese un número: ");
			tabla[i] = sc.nextInt();
		}
		
		for (int i=0; i<tabla.length; i++) {
			if(tabla[i]%2==0) {
				System.out.println("Es par");
			}else {
				System.out.println("Es impar");
			}
		}
		
		sc.close();
		
		

	}

}
