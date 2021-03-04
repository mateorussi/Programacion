import java.util.Scanner;

/**
 * Modifica el ejercicio 1 de la PRACTICA 2_2 para
 * que el proceso se repita 5 veces (para 5 alumnos).
 * Además, queremos que se muestre al final del programa
 * la NOTA MEDIA DEL GRUPO. Hazlo para numeros reales.
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

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la nota de los alumnos");
		float media=0;
		for (int i=0;i<5;i++) {
			float num = sc.nextInt();
			media=media+num;
		}
		System.out.println("La nota media es "+(media/5));
		
	}

}
