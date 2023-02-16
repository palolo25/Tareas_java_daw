
public class Ejercico03AlAzar {

	public static void main(String[] args) {
		int aleatorio = 0;
		for (int i=1; i<=10; i++) {
			aleatorio = (int)(Math.random()*5 +1);
			System.out.println(aleatorio);
		}
	}

}
