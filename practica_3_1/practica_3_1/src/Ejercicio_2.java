import java.util.Scanner;

/**
 * Programa que capture un número por teclado e indique si es par o impar.
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese un numero");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("El numero introducido es par");
		}else {
			System.out.println("El numero introducido es impar");
		}
	}

}
