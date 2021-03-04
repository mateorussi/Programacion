import java.util.Scanner;

/**
 * Repite el ejercicio 1 de la practica P 3.1.
 * Debemos contar cuantos numeros de cada grupo
 * tenemos y antes de introducir el numero
 * siguiente se pregunte si queremos continuar
 * el proceso o terminarlo.
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		boolean continuar=true;
		int pos=0, neg=0, cero=0;
		String cont="null";
		
		do {
			System.out.println("Introduce un número.");
			int num = sc.nextInt();
			
			if (num > 0) {
				System.out.println("El número es positivo.");
				pos =pos+1;	
			}
			else if (num < 0) {
				System.out.println("El número es negativo.");
				neg=neg+1;
			}
			else {
				System.out.println("El número es cero.");
				cero=cero+1;
			}
			System.out.println("¿Quiere continuar?(S/N)");
			cont= sc.next();
			if (cont.contains("S"))
				continuar=true;
			else
				continuar=false;
		} while (continuar == true);
		System.out.println("El número de positivos es "+pos);
		System.out.println("El número de negativos es "+neg);
		System.out.println("El número de ceros es "+cero);
		
	}

}
