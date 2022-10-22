package odev_2;

public class LoopDemo {

	public static void main(String[] args) {

		// For

		for (int i = 1; i < 10; i++) {

			System.out.println(i);

		}
		System.out.println("For döngüsü bitti");

		// while
		
		int i = 1;
		while (i < 5) {
			
			System.out.println(i);
			i++;
			// i+=2; eðer tek sayýlarý yazdýrmak isteseydim
		}
		System.out.println("While döngüsü bitti");
	
		// Do-While
		int j=1;
		do {
			System.out.println(j);
			j+=2;
		
		} while (j<10);
		System.out.println("Do-while döngüsü bitti");
	// þart uymasa bile bir kere çalýþýr. do nun içerisindekini yerine getirir.
	
	}

}
