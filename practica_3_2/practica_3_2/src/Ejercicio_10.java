/**
 * Haz un programa para que el ordenador obtenga un n�mero
 * aleatorio comprendido entre 1 y 100 y t� tengas que adivinarlo.
 * Cada vez que digas un n�mero, el ordenador te dir� si
 * es CORRECTO o que el n�mero a adivinar es mayor o menor que
 * el escrito. Repetir hasta que acierte el n�mero.
 */
//a_3_2;

import java.util.Scanner;

/**
 * @author mateorussi
 *
 */
public class Ejercicio_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num_azar = (int) (Math.random() * 100 + 1);
		int num_intro;

		System.out.println("Ingresa un número");

		identificarNumero(num_azar);

		System.out.println("CORRECTO! has adivinado mi número, era el " + num_azar);
	}

	private static void identificarNumero(int num_azar) {
		int num_intro;
		do {
			Scanner sc = new Scanner(System.in);
			num_intro = sc.nextInt();

			if (num_intro > num_azar) {
				System.out.println("El número es menor");
			}
			if (num_intro < num_azar) {
				System.out.println("El número es mayor");
			}

		} while (num_intro != num_azar);
	}

}
