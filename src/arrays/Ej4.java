package arrays;

public class Ej4 {

	public static void main(String[] args) {
		//Creo la tabla de arrays y le asigno la longitud.
		int num [] = new int [12];
		//Asigno los valores a los índices indicados.
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		//Creo un for para que imprima cada uno de los valores
		//de la tabla.
		for (int i=0; i<num.length; i++){
			System.out.print(num[i]+ "  ");
		}

	}

}
