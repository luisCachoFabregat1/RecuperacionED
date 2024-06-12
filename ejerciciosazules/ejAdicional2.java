package EjerciciosJavaTema2;

import java.util.Scanner;

public class ejAdicional2 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero:");
		num = sc.nextInt();
		for (; num >= 0; num--) {
			for (int a = num; a >= 0; a--) {
				System.out.println(a);
			}
			System.out.println("*********");
		}
	}

}
