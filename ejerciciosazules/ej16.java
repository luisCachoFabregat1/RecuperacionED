package EjerciciosJavaTema2;

/*introduce 2 num, imprimir num naturales entre los dos empezando por el mas peque�o,
 contar cuantos hay y cuanto son pares, y la suma de los impares*/
import java.util.Scanner;

public class ej16 {
	public static void main(String[] args) {
		int tmp = 0, num1 = 0, num2 = 0, cont = 0, contpar = 0, suma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Primer numero:");
		num1 = sc.nextInt();
		System.out.println("Segundo numero:");
		num2 = sc.nextInt();
		if (num2 < num1) {
			tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		cont = num2 - num1;
		for (; num1 <= num2; num1++) {
			System.out.println(num1);
			if (num1 % 2 == 0) {
				++contpar;
			} else {
				suma += num1;
			}
		}
		System.out.println("Hay " + cont + " numeros, de los cuales " + contpar
				+ " son pares y " + suma + " es la suma de los impares.");
	}
}
