import java.util.Scanner;

/**
 * Algoritmo que pida dos números ‘nota’ y ‘edad’ y un carácter ‘género’ y muestre 
 * el mensaje ‘ACEPTADA’ si la nota es mayor o igual a cinco, la edad es mayor 
 * o igual a dieciocho y el género es ‘F’. En caso de que se cumpla lo mismo, 
 * pero el sexo sea ‘M’,debe imprimir ‘ACEPTADO’. Si no se cumplen dichas
 * condiciones se debe mostrar ‘NO ACEPTADO/A’.
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca su nota");
		int nota = sc.nextInt();

		System.out.println("Introduzca su edad");
		int edad = sc.nextInt();

		System.out.println("Introduzca su género (F/M)");
		String genero = sc.next();

		if (nota <= 5 && edad >= 18) {
			if (genero.contains("F")) {
				System.out.println("ACEPTADA");
			} else {
				System.out.println("ACEPTADO");
			}
		} else {
			System.out.println("NO ACEPTADO/A");
		}

	}
}
