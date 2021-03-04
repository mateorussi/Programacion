import java.util.Scanner;

/**
 * Escribe un programa que pida un n�mero entero entre uno
 * y doce e imprima el numero de dias que tiene el mes 
 * correspondiente.
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese un numero entero entre 1 y 12");
		int num=sc.nextInt();
		
		switch (num) {
			case 1:	System.out.println("Enero tiene 31 días");
			break;
			case 2:	System.out.println("Febrero tiene 28 días o 29 días los años bisiestos");
			break;
			case 3:	System.out.println("Marzo tiene 31 días");
			break;
			case 4:	System.out.println("Abril tiene 30 días");
			break;
			case 5:	System.out.println("Mayo tiene 31 días");
			break;
			case 6:	System.out.println("Junio tiene 30 días");
			break;
			case 7:	System.out.println("Julio tiene 31 días");
			break;
			case 8:	System.out.println("Agosto tiene 31 días");
			break;
			case 9:	System.out.println("Septiembre tiene 30 días");
			break;
			case 10: System.out.println("Octubre tiene 31 días");
			break;
			case 11: System.out.println("Noviembre tiene 30 días");
			break;
			case 12: System.out.println("Diciembre tiene 31 días");
			break;
		}
		
		
	}

}
