package arrays;

import java.util.Arrays;
import java.util.Random;

public class Ej8 {

	public static void main(String[] args) {
		
		int aleatorio;
		
		int tabla [] = new int [100];
		
		for(int i=0; i<tabla.length; i++) {
			aleatorio = (int) (1 + Math.random()*10);
			tabla[i] = aleatorio;
		}
		System.out.println(Arrays.toString(tabla));
		
		

	}

}
