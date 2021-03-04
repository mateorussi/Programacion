import java.util.Scanner;

/**
 * Crear un algoritmo que calcule la raiz cuadrada del numero
 * que introduzca el usuario. Si se introduce un numero negativo,
 * debe mostrar un mensaje de error y volver a pedirlo
 * (tantas veces como sea necesario).
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
		
		
		int num;
		
		do {
			System.out.println("Ingrese un numero");
			num=sc.nextInt();
			
			if (num>0) {
				System.out.println("La raiz cuadrada de "+num+" es "+((Double) Math.sqrt(num)));
			}else {
				System.out.println("ERROR: ha ingresado un numero negativo, ingrese un numero positivo");
			}
		}while(num<0);
		
	}

}
