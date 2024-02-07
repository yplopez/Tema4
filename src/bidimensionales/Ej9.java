package bidimensionales;

public class Ej9 {

	public static void main(String[] args) {
		
		//Creo una matriz y le asigno valores
		int[][] tabla = {{16,3,2,13},{5,10,11,8},{9,6,7,12},{4,15,14,1}};
		
		//Creo una variable booleana para llamar a la función esMagica y además le paso la 
		//tabla por parámetro, ahí se almacenará el valor retornado por la función.
		boolean resultado = esMagica(tabla);
		
		//Muestro por pantalla el resultado
		System.out.println(resultado);

	}
	//Creo una función de tipo booleano que recibe como atributo una tabla
	//bidimensional y retorna un valor booleano con el resultado de
	//evaluado en la función
	public static boolean esMagica(int tabla[][]) {
		//Creo una variable de tipo booleano para evaluar si la tabla es
		//mágica o no.
		boolean tablaMagica = true;
		//Creo una variable de tipo entero que acumulará la sumatoria de 
		//los valores de las filas
		int sumaFilas = 0;
		//Creo una variable de tipo entero que acumulará la sumatoria de 
		//los valores de las columnas
		int sumaColumnas = 0;
		
		//Creo un bucle for con dos for anidados a la misma altura para
		//recorrer la matriz, uno recorre las filas y el otro las columnas.
		//En cada for interno se realiza la sumatoria de cada uno de los 
		//elementos de filas o columnas, dependiendo el for.
		for(int i=0; i<tabla.length; i++) {
			for(int j=0; j<tabla.length; j++) {
				sumaFilas += tabla[i][j];
			}
			
			for(int j=0; j<tabla.length; j++) {
				sumaColumnas += tabla[j][i];
			}
			//Asigno a la variable tabla mágica la evaluación para comprobar si 
			//es mágica, al comprobar que la suma de cada fila y de cada columna
			//tienen como resultado el mismo valor.
			tablaMagica = tablaMagica && sumaFilas == sumaColumnas;
			
			
		}
		//Retorno la variable que almacena el resultado de la función, al main 
		//donde sea llamada.
		return tablaMagica;
	}

}
