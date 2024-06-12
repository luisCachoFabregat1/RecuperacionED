package EjerciciosJavaTema2;

// muestra del 1 al 100 calcula la suma de todos los num pares y tambien de los impares
public class ej12 {

	public static void main(String[] args) {
		int sumapar = 0, sumaimpar = 0;
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			if (i % 2 == 0) {
				sumapar += i;
			} else {
				sumaimpar += i;
			}
		}
		System.out.println("Suma numeros pares: " + sumapar);
		System.out.println("Suma numeros impares: " + sumaimpar);
	}

}
