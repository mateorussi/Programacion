import javax.swing.JOptionPane;

/**
 * Hacer un programa que realice las siguientes funciones:
 * 1- Llenar un array con las estaturas de los alumnos de una clase (Previamente
 * habremos pedido que se introduzca por teclado en numero de alumnos de la clase). 
 * 2- Suma de todas las estaturas de la clase.
 * 3- Calculo de la media de estaturas.
 * 4- Visualizar cuantos son mas altos que la media y cuantos mas bajos.
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num_est =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número de estudiantes"));
		int suma=0, cont=0, num_mayor=0, num_menor=0;
		float media;
		int[] vector_est = new int[num_est];
		
		for(int i=0;i<vector_est.length;i++) {
			vector_est[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la estatura del estudiante numero "+i));
			suma+=vector_est[i];
			cont++;
		}
		
		media=(float) suma/cont;
		
		for(int j=0;j<vector_est.length;j++) {
			if(vector_est[j]<media) {
				num_menor++;
			}else {
				num_mayor++;
			}
		}
		System.out.println(num_mayor+" alumnos son mas altos y "+num_menor+" alumnos son mas bajos respecto a la media de estatura de la clase");
	}

}
