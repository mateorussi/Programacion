import java.util.Scanner;

/**
 * Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado
 * de seis caras y muestre por pantalla el n?mero en letras (dato cadena) de la cara opuesta al
 * resultado obtenido.
 * ? Nota 1: En las caras opuestas de un dado de seis caras est?n los n?meros: 1-6, 2-5 y 3-4.
 * ? Nota 2: Si el n?mero del dado introducido es menor que 1 o mayor que 6, se mostrar?
 * el mensaje: ?ERROR: n?mero incorrecto.?.
 */

/**
 * @author bm10DAM1
 *
 */
public class Ejercicio_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cara_dado = 0;
		
		do {
			System.out.println("Ingrese la cara del lado (1-6)");
			Scanner sc=new Scanner(System.in);
			cara_dado=sc.nextInt();
			
			if (cara_dado>=1 && cara_dado<=6) {
				
				switch (cara_dado) {
				case 1: 
					System.out.println("Seis");
					break;
				case 2:
					System.out.println("Cinco");
					break;
				case 3:
					System.out.println("Cuatro");
					break;
				case 4:
					System.out.println("Tres");
					break;
				case 5:
					System.out.println("Dos");
					break;
				case 6:
					System.out.println("Uno");
					break;
			}
				
			}else{
				System.out.println("¡ERROR: número incorrecto!");
			}
		}while(cara_dado<1 && cara_dado>6);
		
		
		
	}

}
