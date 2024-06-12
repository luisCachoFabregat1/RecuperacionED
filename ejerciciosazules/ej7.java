package EjerciciosJavaTema2;

//Termina al escribir "exit" y muestra la cantidad de frases sin contar exit.
import java.util.Scanner;

public class ej7 {
	public static void main(String[] args) {
		int cont = -1;
		String frase = "";
		Scanner sc = new Scanner(System.in);
		while (!frase.equals("exit")) {
			System.out.println("Introduce frase:");
			frase = sc.nextLine();
			cont++;
		}
		System.out.println(cont + " frases:");
	}
}