/**
 * Una compa??a de transporte internacional tiene servicio en algunos pa?ses de Am?rica del
Norte, Am?rica Central, Am?rica del Sur, Europa y Asia. El costo por el servicio de transporte
se basa en el peso del paquete y la zona a la que va dirigido. Lo anterior se muestra en la
tabla:

Zona Ubicaci?n Costo/gramo
1 Am?rica del Norte 24.00 euros
2 Am?rica Central 20.00 euros
3 Am?rica del Sur 21.00 euros
4 Europa 10.00 euros
5 Asia 18.00 euros

Parte de su pol?tica implica que los paquetes con un peso superior a 5 kg no son transportados,
esto por cuestiones de log?stica y de seguridad.
Realice un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el
rechazo de la entrega.
 */

import java.util.Scanner;

/**
 * @author bm10DAM1
 *
 */
public class Ejercicio_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		float peso;
		int zona;
			  /*
			   * algoritmo del cobro de la entrega o el rechazo	
			   */
		System.out.println("Ingrese el peso en gramos de su paquete"
				+ "\nRecuerde que: 1 kg -> 1000 gramos");
		peso=sc.nextFloat();
	
	if (peso<=5000) {
		System.out.println("Ingrese la zona a la que va dirigido el paquete"
				+ "\n1. America del Norte: 24.00"
				+ "\n2. America Central: 20.00"
				+ "\n3. America del Sur: 21.00"
				+ "\n4. Europa: 10.00"
				+ "\n5. Asia: 18.00");
		zona=sc.nextInt();
		
		switch (zona) {
			case 1: System.out.println("El precio del envio es de "+(24.00*peso)+" euros");
			break;
			case 2: System.out.println("El precio del envio es de "+(20.00*peso)+" euros");
			break;
			case 3: System.out.println("El precio del envio es de "+(21.00*peso)+" euros");
			break;
			case 4: System.out.println("El precio del envio es de "+(10.00*peso)+" euros");
			break;
			case 5: System.out.println("El precio del envio es de "+(18.00*peso)+" euros");
			break;
		}
		
	}else {
		System.out.println("No puede ser transportado, indique un peso inferior a 5000 gramos (5 kg)");
	}
	}

}
