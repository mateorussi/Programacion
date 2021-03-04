/**
 * Introducir un numero por teclado y mostrar si el numero
 * es primo o no. (*) Un numero es primo si es divisible
 * solo por 1 y por si mismo.
 */

import java.util.Scanner;

/**
 * @author mateorussi
 *
 */
public class Ejercicio_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduzca un numero");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int cont = 0;
		for (int i=1;i<=num;i++) {
			if(num%i==0) {
				cont++;
			}
		}
		
		if (cont!=2) {
			System.out.println("El numero no es primo");
		}else {
			System.out.println("El numero es primo");
		}
		
	}

}
