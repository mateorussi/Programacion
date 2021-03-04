import javax.swing.JOptionPane;

/**
 * Nos piden rellenar 4 boletos de la bonoloto. Debemos controlar que no se pueden 
 * repetir los números en una misma apuesta. Visualizar las cuatro apuestas.
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] bonoloto1 = new int[9];
		int[] bonoloto2 = new int[9];
		int[] bonoloto3 = new int[9];
		int[] bonoloto4 = new int[9];
		
		//Bonoloto 1
		
		boolean error = false;
		do {
			for(int i=1;i<bonoloto1.length;i++) {
				bonoloto1[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero "+i+" del boleto de la bonoloto 1"));
			}
			
			//comprobar valores iguales
			
	        error = comprobarValoresIguales(bonoloto1);
		}while(error!=false);
		
		
		//Bonoloto 2
		
		do {
			for(int i=1;i<bonoloto2.length;i++) {
				bonoloto2[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero "+i+" del boleto de la bonoloto 2"));
			}
			
			//comprobar valores iguales
			
	        error = comprobarValoresIguales(bonoloto2);
		}while(error!=false);

		
		//Bonoloto 3
		
		do {
			for(int i=1;i<bonoloto3.length;i++) {
				bonoloto3[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero "+i+" del boleto de la bonoloto 3"));
			}
			
			//comprobar valores iguales
			
	        error = comprobarValoresIguales(bonoloto3);
		}while(error!=false);

		//Bonoloto 4
		
		do {
			for(int i=1;i<bonoloto4.length;i++) {
				bonoloto4[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero "+i+" del boleto de la bonoloto 4"));
			}
			
			//comprobar valores iguales
			
	        error = comprobarValoresIguales(bonoloto4);
		}while(error!=false);

		
		//Visualizar bonolotos
		System.out.println("Apuesta bonoloto Nº1");
		for (int j = 1; j < bonoloto1.length; j++) {
			System.out.print(bonoloto1[j]+"    ");
		}
		System.out.println("\nApuesta bonoloto Nº2");
		for (int j = 1; j < bonoloto2.length; j++) {
			System.out.print(bonoloto2[j]+"    ");
		}
		
		System.out.println("\nApuesta bonoloto Nº3");
		for (int j = 1; j < bonoloto3.length; j++) {
			System.out.print(bonoloto3[j]+"    ");
		}
		System.out.println("\nApuesta bonoloto Nº4");
		for (int j = 1; j < bonoloto4.length; j++) {
			System.out.print(bonoloto4[j]+"    ");
		}
		
	}

	private static boolean comprobarValoresIguales(int[] bonoloto1) {
		
		for (int i = 0; i < bonoloto1.length; i++) {
			for (int j = i + 1; j < bonoloto1.length; j++) {
				if (bonoloto1[i] == bonoloto1[j]) {
					return true;
				}
			}
		}
		return false;
	}

}
