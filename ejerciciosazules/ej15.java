package EjerciciosJavaTema2;

// Tablas de multiplicar de 1 a 5
public class ej15 {
	public static void main(String[] args) {
		for (int tabla = 1; tabla <= 5; tabla++) {
			System.out.println("\n***** TABLA DEL "+tabla+" *******");
			for (int num = 0; num <= 10; num++) {
				System.out.println(tabla + " x " + num + " = " + tabla * num);
			}
		}
	}
}