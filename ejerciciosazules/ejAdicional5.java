package EjerciciosJavaTema2;

// Juego del casino con los dados.

import java.util.Scanner;

public class ejAdicional5 {
	public static void main(String[] args) {
		String next = "";
		int saldoActual=0, apuestaSaldo=0, apuestaDado=0, dado1=0, dado2=0, cont=0;
		Scanner sc = new Scanner(System.in);
		int saldoInicial = (int) (Math.random() * 300 + 1);
		saldoActual = saldoInicial;

		for (cont = 0; !next.equalsIgnoreCase("n") && !next.equalsIgnoreCase("no"); cont++) {
			System.out.println("Tu saldo actual es " + saldoActual + "€");
			System.out.println("Hagan sus apuestas...");
			do {
				System.out.println("Introduce cantidad a apostar:");
				apuestaSaldo = sc.nextInt();
				if (apuestaSaldo > saldoActual || apuestaSaldo <= 0) {
					System.out.println("Error, tu apuesta no puede ser superior a tu saldo ni inferior a 1.");
				}
			} while (apuestaSaldo > saldoActual || apuestaSaldo <= 0);

			do {
				System.out.println("Introduce numero a apostar:");
				apuestaDado = sc.nextInt();
				if (apuestaDado < 2 || apuestaDado > 12) {
					System.out.println("Error, solo de 2 a 12.");
				}
			} while (apuestaDado < 2 || apuestaDado > 12);
			System.out.println("Comienza el juego!!! Lanzando dados....");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			dado1 = (int) (Math.random() * 6 + 1);
			dado2 = (int) (Math.random() * 6 + 1);
			System.out.println("Dado 1: " + dado1 + "   Dado 2: " + dado2
					+ "      Resultado: " + dado1 + " + " + dado2 + " = "
					+ (dado1+dado2));

			if (dado1+dado2 == apuestaDado) {
				saldoActual += apuestaSaldo;
				System.out.println("Has ganado " + apuestaSaldo + "€");
			} else {
				saldoActual -= apuestaSaldo;
				System.out.println("Has perdido " + apuestaSaldo + "€");
			}

			do {
				if (saldoActual > 0) {
					System.out.println("¿Quieres seguir jugando?");
					next = sc.next();
					if (!next.equalsIgnoreCase("s") && !next.equalsIgnoreCase("n") && !next.equalsIgnoreCase("si") && !next.equalsIgnoreCase("no")) {
						System.out.println("Error, solo Si o No.");
					}
				} else {
					next = "N";
					System.out.println("Game Over");
				}
			} while (!next.equalsIgnoreCase("s") && !next.equalsIgnoreCase("n") && !next.equalsIgnoreCase("si") && !next.equalsIgnoreCase("no"));
		}

		if (saldoActual < saldoInicial) {
			saldoInicial -= saldoActual;
			System.out.println("Tu saldo es de " + saldoActual + "€. Has perdido "
					+ saldoInicial + "€ en " + cont + " jugadas.");
		} else {
			saldoInicial = saldoActual - saldoInicial;
			System.out.println("Tu saldo es de " + saldoActual + "€. Has ganado "
					+ saldoInicial + "€ en " + cont + " jugadas.");
		}
	}
}