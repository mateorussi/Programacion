import java.util.Scanner;

/**
 * Programa una calculadora que me pida dos valores numéricos por teclado y la
 * operación que se quiere realizar de entre las siguientes, suma, resta, 
 * multiplicación y división.
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número");
		int num1 = sc.nextInt();

		System.out.println("Introduce uno de los siguientes símbolos (escribir número):");
		System.out.println("1. +");
		System.out.println("2. -");
		System.out.println("3. *");
		System.out.println("4. /");
		int operador = sc.nextInt();

		System.out.println("Introduce el segundo número");
		int num2 = sc.nextInt();

		switch (operador) {
		case 1:
			System.out.println(num1 + num2);
			break;
		case 2:
			System.out.println(num1 - num2);
			break;
		case 3:
			System.out.println(num1 * num2);
			break;
		case 4:
			System.out.println(num1 / num2);
			break;
		}

	}
}
