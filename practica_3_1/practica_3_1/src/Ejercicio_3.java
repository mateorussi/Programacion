import java.util.Scanner;

/**
 * Crea un programa que pida al usuario dos números y muestre su división si el
 * segundo no es cero, o un mensaje de aviso en caso contrario.
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese dos numeros");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num2=sc.nextInt();
		
		if(num2!=0) {
			System.out.println("La division entre "+num+" y "+num2+" es: "+((float) num/num2));
		}else {
			System.out.println("El segundo numero ingresado es cero, ingrese un numero distinto a cero");
		}
	}

}
