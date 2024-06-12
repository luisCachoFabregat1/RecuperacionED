package EjerciciosJavaTema2;

//muestra los impares del 1 al 100 y cuantos hay.
public class ej5 {

	public static void main(String[] args) {
		int cont = 0;
		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);
			cont++;
		}
		System.out.println("Hay " + cont + " números impares.");
	}

}