package EjerciciosJavaTema2;

//Imprimir y contar los multiplos de 3 y 2
public class ej13 {

	public static void main(String[] args) {
		int cont = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.println(i);
				cont++;
			}
		}
		System.out.println("En total hay " + cont + " múltiplos de 2 o de 3");
	}
}
