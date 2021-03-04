import java.util.Scanner;
/**
 * Determine el menor valor de 5 números introducidos por teclado. Considere 
 * que el menor valor puede repetirse. Por ejemplo: Si los números introducidos 
 * fueran. 14, 19, 14, 16 y 15. El menor valor introducido es 14.
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce 5 números.");
        Scanner sc = new Scanner(System.in);
        int vector[] = new int[5];
        for (int i = 0; i < 5; i++) {
            vector[i] = sc.nextInt();
        }
        int menor=vector[0];
        for (int i = 0; i < 5; i++) {
            if (vector[i]<=menor) {
                menor = vector[i];
            }
        }
        System.out.println("El menor es "+menor);
	}

}
