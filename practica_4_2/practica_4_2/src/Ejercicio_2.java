import java.util.Scanner;

/**
 * Disponemos de una máquina automática de venta de bebidas. Disponemos de tres
 * productos: agua cuyo precio es 0’50, refresco con precio de 0’75 y zumo cuyo
 * precio es de 0’95 cts.
 * 
 * El programa emitirá un menú que mostrará los productos y sus precios, así como la
 * opción de salir. El programa pedirá la opción elegida y el dinero que se introduce
 * para pagar.
 * 
 * Nuestra máquina acepta todas las monedas de euro a excepción de los 2 cts y 1 cts.
 * 
 * Al comienzo del día, la máquina dispone de 20 monedas de todas las cantidades
 * necesarias para el cambio.
 * 
 * Se debe dar el cambio correcto, con el menor número de monedas posibles. Quiero
 * que aparezca en pantalla un mensaje de “INTRODUZCA IMPORTE EXACTO” si
 * no tenemos dos tipos de monedas cualesquiera o un tipo si es la de 5 cts, y que sólo
 * acepte este dinero.
 * 
 * Al finalizar el programa nos debe dar el total del dinero disponible en la máquina,
 * por unidad monetaria.
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

		Scanner sc=new Scanner(System.in);
		
		
		boolean salir=false, validar=false;
		int opc;
		float precio, dinero = 0;
		
		while (!salir){
			System.out.println("Elija una opcion de compra:"
					+ "\n1. Agua 0,50€ "
					+ "\n2. Refresco 0,75€"
					+ "\n3. Zumo 0,95€"
					+ "\n4. Salir");
			opc=sc.nextInt();
			
			System.out.println();
			
			switch (opc) {
				case 1:	
					precio= (float) 0.50;
					
				dinero = validarMonedas(sc, validar, dinero);

				dinero = devolverCambio(precio, dinero);
					break;
				case 2:	
					precio= (float) 0.75;
					dinero = validarMonedas(sc, validar, dinero);

					dinero = devolverCambio(precio, dinero);
					break;
				case 3:	
					precio= (float) 0.95;
					dinero = validarMonedas(sc, validar, dinero);

					dinero = devolverCambio(precio, dinero);
					break;
				case 4:	
					salir=true;
					break;
					

			default:
				System.out.println("Ingrese una opcion correcta\n");
				break;
			}
		}
	        System.out.println("Total de dinero disponible por unidad monetaria: "
	        		+ "\n"+);
		
	}

	private static float devolverCambio(float precio, float dinero) {
		int cont2 = 20, cont1 = 20, cont05 = 20, cont02 = 20, cont01 = 20, cont005 = 20;
		if (dinero==precio) {
			System.out.println("Has introducido el importe exacto");
		}else{
			dinero-=precio;
			System.out.println("El cambio a devolver es el siguiente");
			if (dinero/2>0) {
				System.out.println("Monedas de 2€: "+dinero/2);
				cont2--;
			}
			if (dinero/1>0) {
				System.out.println("Monedas de 1€: "+dinero/1);
				cont1--;
			}
			if (dinero/0.50>0) {
				System.out.println("Monedas de 50 centimos: "+dinero/0.05);
				cont05--;
			}
			if (dinero/0.20>0) {
				System.out.println("Monedas de 20 centimos: "+dinero/0.20);
				cont02--;
			}
			if (dinero/0.10>0) {
				System.out.println("Monedas de 10 centimos: "+dinero/0.10);
				cont01--;
			}
			if (dinero/0.05>0) {
				System.out.println("Monedas de 5 centimos: "+dinero/0.05);
				cont005--;
			}
		}
		return dinero;
	}

	private static float validarMonedas(Scanner sc, boolean validar, float dinero) {
		while(!validar) {
			System.out.println("Ingrese monto proporcionado a la maquina");
			dinero=sc.nextFloat();
			
			if (dinero==0.02) {
				System.out.println("\nNo se aceptan monedas de 2 centimos, ingrese otra cantidad");
			}
			
			if (dinero==0.01){
				System.out.println("\nNo se aceptan monedas de 1 centimo, ingrese otra cantidad");
			}
		}
		return dinero;
	}

}
