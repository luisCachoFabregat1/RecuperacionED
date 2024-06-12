package EjerciciosJavaTema2;

//Pregunta 5 num y muestra el mayor y el menor
import java.util.Scanner;

public class ej14 {
	public static void main(String[] args) {
		int mayor = 0, menor = 0, num = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Numero:");
			num = sc.nextInt();
			if (i == 0) {
				mayor = num;
				menor = num;
			}
			if (num > mayor) {
				mayor = num;
			}
			if (num < menor) {
				menor = num;
			}
		}
		System.out.println("El numero menor es: " + menor);
		System.out.println("El numero mayor es: " + mayor);
	}
}
