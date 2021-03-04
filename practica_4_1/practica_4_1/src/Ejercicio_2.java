import javax.swing.JOptionPane;

/**
 * A partir de dos vectores numericos de 15 elementos, denominados vector1 y vector2,
 * respectivamente, obtener un tercer vector, vector3 cuyos elementos sean la suma de
 * los elementos de los vectores anteriores. Completar los vectores con numeros comprendidos
 * entre 0 y 100, generados aleatoriamente. (Sumar arrays o vectores es sumar elemento
 * a elemento y colocar el resultado en la misma posicion del vector resultado).
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

		int[] vector1=new int[15];
		int[] vector2=new int[15];
		int[] vector3=new int[15];
		
		for(int i=0;i<vector1.length;i++) {
			vector1[i]= (int) (Math.random()*100+1);
		}
		for(int i=0;i<vector2.length;i++) {
			vector2[i]= (int) (Math.random()*100+1);
		}
		
		//Suma
		
		for(int x=0;x<vector3.length;x++) {
			vector3[x]=vector1[x]+vector2[x];
		}
		//Visualizar
		
		System.out.println("El vector 1 es: ");
		for(int j=0;j<vector1.length;j++) {
			System.out.print(vector1[j]+"    ");
		}
		
		System.out.println("\nEl vector 2 es: ");
		for(int j=0;j<vector2.length;j++) {
			System.out.print(vector2[j]+"    ");
		}
		System.out.println("\nLa suma del vector 1 y 2 es:");
		
		for(int j=0;j<vector3.length;j++) {
			System.out.print(vector3[j]+"    ");
		}
	}

}
