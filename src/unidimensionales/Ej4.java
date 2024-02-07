package unidimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// Creo una variable para la posición de la tirada del turno humano
		int posicionBarco;
		
		//Creo la variable hay ganador de tipo booleano para controlar si el jugador humano o
		//la máquina han ganado, es decir han tenido 4 aciertos.
		boolean hayGanador = false;

		// Creo la variable tiroPersona de tipo entero para almacenar cada tiro del
		// jugador
		int tiroPersona;

		// Creo la variable tiroPc de tipo entero para almacenar cada tiro del ordenador
		int tiroPc;

		// Creo una variable aciertoPersona de tipo entero para acumular los aciertos
		// del jugador
		int aciertoPersona = 0;

		// Creo una variable aciertoPersona de tipo entero para acumular los aciertos
		// del pc
		int aciertoPc = 0;

		// Creo un array de tipo entero con longitud 20 y posiciones asignadas
		int panelPc[] = new int[20];

		// Creo un array de tipo entero para las jugadas del ordenador
		int jugadaPc[] = new int[20];

		// Creo un array de tipo entero para que el humano asigne las posiciones de sus
		// barcos
		int panelPersona[] = new int[20];

		// Creo un array de tipo entero para las jugadas del humano
		int jugadaPersona[] = new int[20];

		// Creo el Scanner para ingreso de datos
		Scanner sc = new Scanner(System.in);

		// Hago un bucle for para cargar el panel del ordenador de forma aleatoria
		// haciendo uso de la clase Math
		for (int i = 1; i <= 4; i++) {
			posicionBarco = (int) Math.floor(Math.random() * 20);
			// Evaluo mediante dos concionales if que tiro no se ubique en la posición
			// cero, ni 19 del array y lo asigno una posicion más o menos segun corresponda
			if (posicionBarco == 0) {
				posicionBarco = 0 + 1;
			}
			if (posicionBarco == 19) {
				posicionBarco = 19 - 1;
			}

			// Condiciono que si ya existe un numero 1(barco) en el siguiente número
			// aleatorio
			// siga generando núymeros y que no posicione 1´s(barcos) en posición adyacente
			if (panelPc[posicionBarco] == 1 || panelPc[posicionBarco - 1] == 1 || panelPc[posicionBarco + 1] == 1) {
				i--;
			} else {
				panelPc[posicionBarco] = 1;
			}
		}

		// Pido al jugador humano que introduzca las ubicaciones de sus jugadas
		System.out.println("¡Bienvenido al juego de los barquitos!");

		// Hago un bucle for para número ingresado pedir los números de las tiradas del
		// jugador humano.
		// Almaceno en la variable tiro cada número ingresado.
		// Le asigno a panelPersona en la posición tiro el número 1.
		for (int i = 1; i <= 4; i++) {
			System.out.println("Ingrese la ubicación del barco numero " + i + " : ");
			posicionBarco = sc.nextInt();
			panelPersona[posicionBarco] = 1;
		}
		
		//Hago un bucle while que controla si alguno de los dos jugadores (máquina o persona)
		//ha ganado y en ese caso termina el juego.
		while (!hayGanador) {			
				// Pido al jugador que haga un tiro y lo almaceno en la variable tiroPersona
				System.out.println("Introduzca un número de 0 a 19 para dirigir su tiro: ");
				tiroPersona = sc.nextInt();

				// Almaceno en el panel de jugadas de la persona un uno en la posición
				// seleccionada (tiroPersona)
				jugadaPersona[tiroPersona] = 1;
				
				//Evaluo si el array panelPc en la posición ingresada por la persona contiene un uno, si es así, acertó.
				//Ademas cuenta cada acierto de la persona y los va mostrando.
				if (panelPc[tiroPersona] == 1) {
					aciertoPersona++;
					System.out.println("Has acertado! LLevas: " + aciertoPersona + " aciertos.");
					
					//Evaluo si el contador aciertoPersona ha llegado a 4 aciertos y en ese caso ha ganado.
					if (aciertoPersona == 4) {
						hayGanador = true;
					}
					
					//Luego de haber acertado un tiro, se reemplaza el uno por un cero en la posición ingresada.
					panelPc[tiroPersona] = 0;
				}
				// muestro las jugadas del humano
				System.out.println("jugada persona" + Arrays.toString(jugadaPersona));
				
				//Se genera un número aleatorio para simular el tiro del ordenador
				tiroPc = (int) Math.floor(Math.random() * 20);
				// Almaceno en el panel de jugadas de la máquina un uno en la posición
				// selccionada (tiroPc)
				jugadaPc[tiroPc] = 1;

				//Evaluo si el array panelPersona en la posición ingresada por el ordenador contiene un uno, si es así, acertó.
				//Ademas cuenta cada acierto del ordenador y los va mostrando.
				if (panelPersona[tiroPc] == 1) {
					aciertoPc++;
					System.out.println("La maquina ha acertado! LLevas: " + aciertoPc + " aciertos.");
					
					//Evaluo si el contador aciertoPc ha llegado a 4 aciertos y en ese caso ha ganado.
					if (aciertoPc == 4) {
						hayGanador = true;
					}
					
					//Luego de haber acertado un tiro, se reemplaza el uno por un cero en la posición ingresada.
					panelPersona[tiroPc] = 0;
				}
				// muestro las jugadas del ordenador
				System.out.println(Arrays.toString(jugadaPc));
			
		} // cierre while
		System.out.print("Hay ganador!!!!!!!!");
		// cierro el scanner
		sc.close();
	}

}
