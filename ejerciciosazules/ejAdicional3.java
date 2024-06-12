package EjerciciosJavaTema2;

// Pirámide de números
import java.util.Scanner;

public class ejAdicional3 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero:");
		num = sc.nextInt();
		for (int i = 0; i <= num; i++) {
			for (int a = 0; a < i; a++) {
				System.out.print(i);
			}
			System.out.println(i);
		}
	}

}
