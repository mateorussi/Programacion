import java.util.Scanner;
/**
 * Diseñe un programa que lea un número entero (positivo o negativo) y 
 * determine si tiene 1, 2,3, 4 o más cifras, visualizando lo que corresponda.
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = sc.nextInt();
        System.out.println("Tiene "+Integer.toString(num).length()+" dígitos.");
	}

}
