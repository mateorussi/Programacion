import java.util.Scanner;

/**
 * Modificar el ejercicio 3 para que estemos
 * continuamente repasando tablas de multiplicar,
 * hasta que le indiquemos lo contrario.
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

		Scanner sc= new Scanner(System.in);
		int tabla=0, resul=0;
		boolean continuar=true;
		String cont="null";
		do {
			System.out.println("¿Que tabla de multiplicar quieres hacer?");
			tabla= sc.nextInt();
			for (int i =1;i<=10;i++){
				System.out.println(tabla+" por "+i);
				resul=sc.nextInt();
				if (resul==i*tabla)
					System.out.println("Correcto");
				else System.out.println("Incorrecto");
			}
			System.out.println("¿Quiere continuar?(S/N)");
			cont =sc.next();
			if (cont.contains("S"))
				continuar=true;
			else
				continuar=false;
			
		} while (continuar==true);
	}

}
