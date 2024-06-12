package EjerciciosJavaTema2;

//Mostrar y contar multiplos de 3 desde 1 a x
import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {
		int num, cont = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero:");
		num = sc.nextInt();
		for (int i = 3; i <= num; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
				cont++;
			}
		}
		System.out.println("Hay " + cont + " múltiplos de 3.");
	}
}
