/**
 * Practica el uso de constantes.
 * Queremos calcular la longitud de una circunferencia, el ?rea de un c?rculo
 * y volumen de una esfera, a partir del radio que se introducir? por teclado.
 * Define PI como constante y prueba durante el programa a cambiar su
 * valor.
 * Despu?s de ejecutarse el proceso anterior, pregunta al usuario si quiere
 * continuar con otro caso (S/N). El programa terminar? cuando el usuario
 * responda N.
 * F?rmulas:
 * L = 2 . n . r A = 4. n .r2 V = - n . r 3
 */

import java.util.Scanner;

/**
 * @author bm10DAM1
 *
 */
public class Ejercicio_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double pi;
		float radio;
		char continuar;
		pi = 3.141582;
		Scanner dato = new Scanner(System.in);
		
			do {
				System.out.println("Introduce el radio de la circunferencia:");
				radio= dato.nextFloat();
				System.out.println("La longitud de la circunferencia es " + (2*pi*radio));
				System.out.println("El área del círculo es " + Math.pow(radio,2)*pi);
				System.out.println("¿Quiere continuar?(s/n)");
				continuar = dato.next().charAt(0);
			}
			while (continuar=='s');
	}

}
