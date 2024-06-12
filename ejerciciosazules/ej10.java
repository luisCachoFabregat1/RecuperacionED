package EjerciciosJavaTema2;

//Introduce num y dice si es par o impar
import java.util.Scanner;

public class ej10 {
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero:");
		num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("El número " + num + " es par.");
		} else {
			System.out.println("El número " + num + " es impar.");
		}
	}

}
