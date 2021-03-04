import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 * Realizar un programa Java que cargue un vector con las notas de los 4
 * alumnos de una clase y visualice el numero de alumnos aprobados, el
 * numero de alumnos suspensos, la nota media de la clase, y el numero de
 * calificaciones superiores a la media.
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

		double aprobados=0, suspensos=0, nota_media=0, suma_notas=0, media_sup=0;
		
		Scanner sc=new Scanner(System.in);
		
		double [] nota=new double[4];
	
		//Introducir las notas
		for (int i=0;i<nota.length;i++) {
			System.out.println("Introduce la nota del alumno "+i);
			nota[i]=sc.nextDouble();
		}
		
		//Identifica aprobados y suspensos
		
		for (int i=0;i<nota.length;i++) {
			
			if (nota[i]>=5) {
				aprobados++;
			}else {
				suspensos++;
			}
		}
		
		//Suma de notas
		
		for(int i=0;i<nota.length;i++) {
			suma_notas+=nota[i];
		}
		
		//Nota media
		
		nota_media=suma_notas / nota.length;
		
		//Notas superiores a la media
		
		for (int i=0;i<nota.length;i++) {
			if(nota[i]>nota_media) {
				media_sup++;
			}
		}
		
		System.out.println("El numero de alumnos aprobados es: "+aprobados);
		System.out.println("El numero de alumnos suspensos es: "+suspensos);
		System.out.println("La nota media de la clase es: "+nota_media);
		System.out.println("El numero de calificaciones superiores a la media es: "+media_sup);
	}

}
