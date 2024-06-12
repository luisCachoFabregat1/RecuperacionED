package EjerciciosJavaTema2;

//muestra los numeros naturales desde 1 hasta x
import java.util.Scanner;

public class ej6 {
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número:");
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
	}
}
