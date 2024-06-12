package EjerciciosJavaTema2;

import java.util.Scanner;

public class ejAdicional1 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero:");
		num = sc.nextInt();
		for (int i = 0; i <= num; i++) {
			for (int a = 0; a <= i; a++) {
				System.out.println(a);
			}
			System.out.println("*********");
		}
	}
}
