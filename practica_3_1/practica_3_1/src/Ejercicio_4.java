import java.util.Scanner;

/**
 * Realiza un algoritmo que calcule la potencia, para ello pide por teclado la base
 * y el exponente. Pueden ocurrir tres cosas:
 * 
 * - El exponente sea positivo, sólo tienes que imprimir la potencia.
 * - El exponente sea 0, el resultado es 1.
 * - El exponente sea negativo, el resultado es 1/potencia con el exponente
 * 	 positivo.
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese una base para la potencia");
		int base=sc.nextInt();
		System.out.println("Ingrese un exponente para la potencia");
		int exponente=sc.nextInt();
		
		if(exponente>0) {
			System.out.println("La potencia es "+((int) Math.pow(base, exponente)));
		}else if(exponente==0) {
			System.out.println("La potencia es 1");
		}else {
			System.out.println("La potencia es "+ (1/Math.pow(base, -exponente)));
		}
	}

}
