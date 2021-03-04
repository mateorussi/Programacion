/**
 * Escribe un programa que dados dos numeros, uno real (base) 
 * y un entero positivo (exponente), saque por pantalla el 
 * resultado de la potencia. No se puede utilizar el operador de potencia.
 */

import java.util.Scanner;

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
		
		float base;
		int exponente;
		
		System.out.println("Ingrese la base");
		Scanner sc=new Scanner(System.in);
		base=sc.nextFloat();
		
		System.out.println("Ingrese el exponente");
		exponente=sc.nextInt();
		
		int resPot = 0;
		for(int i=0;i<exponente;i++) {
			resPot= (int) (base*base);
		}
	
		System.out.println("La potencia es "+resPot);
	}

}
