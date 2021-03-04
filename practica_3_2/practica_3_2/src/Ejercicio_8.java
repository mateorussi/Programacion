import java.util.Scanner;

/**
 * Modifica el ejercicio anterior para que cuente
 * el numero de fallos que hemos tenido al
 * repasar una tabla de multiplicar.
 */
;

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

		Scanner sc= new Scanner(System.in);
		int tabla=0, resul=0, numCorrectos=0, numIncorrectos=0;
		boolean continuar=true;
		String cont="null";
		do {
			System.out.println("¿Que tabla de multiplicar quieres hacer?");
			tabla= sc.nextInt();
			for (int i =1;i<=10;i++){
				System.out.println(tabla+" por "+i);
				resul=sc.nextInt();
				if (resul==i*tabla) {
					numCorrectos = numCorrectos+1;
				}
				else {
					numIncorrectos=numIncorrectos+1;
				}
			}
			System.out.println("Ha tenido "+numCorrectos+" aciertos y "
					+numIncorrectos+" fallos");
			System.out.println("¿Quiere continuar?(S/N)");
			cont =sc.next();
			if (cont.contains("S"))
				continuar=true;
			else
				continuar=false;
			
		} while (continuar==true);
	}

}
