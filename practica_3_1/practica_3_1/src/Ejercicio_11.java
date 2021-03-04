import java.util.Scanner;

/**
 * Capturamos tres números por teclado y debemos ordenarlos de mayor a 
 * menor.
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 3 números distintos");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int mayor, medio, menor;

		if ((num1 >= num2) && (num1 >= num3)) {
			mayor = num1;
			if (num2 >= num3) {
				medio = num2;
				menor = num3;
			} else {
				medio = num3;
				menor = num2;
			}
		} else if ((num2 >= num1) && (num2 >= num3)) {
			mayor = num2;
			if (num3 >= num1) {
				medio = num3;
				menor = num1;
			} else {
				medio = num1;
				menor = num3;

			}
		} else {
			mayor = num3;
			if (num2 >= num1) {
				medio = num2;
				menor = num1;
			} else {
				medio = num1;
				menor = num2;
			}
		}

		System.out.println(mayor + " es el mayor.");
		System.out.println(medio + " es el del medio");
		System.out.println(menor + " es el menor.");

	}

}
