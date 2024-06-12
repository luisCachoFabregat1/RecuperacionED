package EjerciciosJavaTema2;

// Solo nos permite introducir S o N , para al introducir S o N mayuscula o minuscula.
import java.util.Scanner;

public class ej8 {
	public static void main(String[] args) {
		String x = "";
		Scanner sc = new Scanner(System.in);
		while (!x.equalsIgnoreCase("S") && !x.equalsIgnoreCase("N")) {
			System.out.println("Introduce frase:");
			x = sc.nextLine();
			if (!x.equalsIgnoreCase("S") && !x.equalsIgnoreCase("N")) {
				System.out.println("Error, solo S o N.");
			} else {
				System.out.println(x);
			}
		}
	}
}