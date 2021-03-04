import java.util.Scanner;

/**
 * Crear un algoritmo que pida al usuario un número y le diga si es positivo,
 * negativo o cero.
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese un numero");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if (num==0) {
			System.out.println("El numero introducido es un cero");
		}else if(num<0){
			System.out.println("El numero introducido es negativo");
		}else {
			System.out.println("El numero introducido es positivo");
		}
	}

}
