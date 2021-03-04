import java.util.Scanner;
/**
 * Crear un algoritmo que calcule la raíz cuadrada del número que introduzca el 
 * usuario. Si se introduce un número negativo, debe mostrar un mensaje de 
 * error.
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = sc.nextInt();
        while (num<0){
            System.out.println("Introduce un número positivo");
            num = sc.nextInt();
        }
        System.out.println(Math.sqrt(num));
	}

}
