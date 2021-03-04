/**
 * El director de una escuela esta organizando un viaje de estudios, y requiere determinar cuanto
 * debe cobrar a cada alumno y cuanto debe pagar a la compañia de viajes por el servicio.
 * La forma de cobrar es la siguiente:
 * si son 100 alumnos o mas, el costo del viaje por cada alumno es de 65 euros;
 * de 50 a 99 alumnos, el costo es de 70 euros,
 * de 30 a 49, de 95 euros,
 * y si son menos de 30 no hay viaje.
 * Ademas, el costo de un autobus es de 4000 euros, sin importar el numero de alumnos.
 * LA capacidad de un autobus es de 60 plazas.+
 * Realice un algoritmo que permita determinar el pago a la agencia de viajes y lo que debe
 * pagar cada alumno por el viaje.
 */


import java.util.Scanner;

/**
 * @author bm10DAM1
 *
 */
public class Ejercicio_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce el número de alumnos:");
		Scanner sc = new Scanner(System.in);
		int alum = sc.nextInt();
		int coste = 0;
		if (alum>=100) {
			coste=65;
		} else if ((alum>=50) && (alum<=99)){
			coste=70;
		} else if ((alum>=30) && (alum<=49)){
			coste=95;
		} else if (alum<30) {
			coste=110;
		}
		float bus = alum/60;
		float costebus = bus*4000;
		float pago = ((coste*alum)+costebus);
		System.out.println("El pago a la Agencia asciende a "+pago+" €");
		System.out.println("El pago por alumno es de "+(pago/alum));
		
	}

}
