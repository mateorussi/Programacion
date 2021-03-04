/**
 * Muestra en pantalla 15 numeros obtenidos de forma aleatoria.
 * Entre un numero y otro haz que el ordenador espere dos segundos
 * como si estuviera pensando en obtener el nuevo numero.
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

		int min = 1;
		int max = 100;
		for(int i = min; i <=15; i++) {
			int getRandomValue = (int) (Math.random()*(max-min)) + min;
			System.out.println(getRandomValue);
			
			esperar(2);
	}

	}

	private static void esperar(int segundos) {
		// TODO Auto-generated method stub
		try {
            Thread.sleep(segundos * 1000);
         } catch (Exception e) {
            System.out.println(e);
         }
	}

}
