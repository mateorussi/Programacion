import java.util.Scanner;

/**
 * Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día 
 * correspondiente. Si introducimos otro número nos da un error.
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el día de la semana (1-7)");
		int dia = sc.nextInt();
		String semana[] = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
		System.out.println(semana[dia - 1]);
	}

}
