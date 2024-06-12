package EjerciciosJavaTema2;
// Reloj
public class ejAdicional6 {
	public static void main(String[] args) {
		for(int h=0;h<24;h++) {
			for(int min=0;min<60;min++) {
				for(int s=0;s<60;s++) {
					System.out.println(h+":"+min+":"+s);
				}
			}
		}
	}
}
