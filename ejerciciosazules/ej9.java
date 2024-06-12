package EjerciciosJavaTema2;

//Introduce num y dice si es positivo o negativo
import java.util.Scanner;

public class ej9 {
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero:");
		num = sc.nextInt();
		if (num < 0) {
			System.out.println("El número " + num + " es negativo.");
		} else {
			System.out.println("El número " + num + " es positivo.");
		}
	}

}
