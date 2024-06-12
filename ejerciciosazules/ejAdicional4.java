package EjerciciosJavaTema2;
//Invertir número
import java.util.Scanner;

public class ejAdicional4 {
	public static void main(String[] args) {
		String sCadena = "", sCadenaInvertida = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero:");
		sCadena = sc.next();
		for (int i = sCadena.length() - 1; i >= 0; i--) {
			sCadenaInvertida = sCadenaInvertida + sCadena.charAt(i);
		}
		System.out.println(sCadenaInvertida);
	}
}
