package odev_2;

public class LoopDemo {

	public static void main(String[] args) {

		// For

		for (int i = 1; i < 10; i++) {

			System.out.println(i);

		}
		System.out.println("For d�ng�s� bitti");

		// while
		
		int i = 1;
		while (i < 5) {
			
			System.out.println(i);
			i++;
			// i+=2; e�er tek say�lar� yazd�rmak isteseydim
		}
		System.out.println("While d�ng�s� bitti");
	
		// Do-While
		int j=1;
		do {
			System.out.println(j);
			j+=2;
		
		} while (j<10);
		System.out.println("Do-while d�ng�s� bitti");
	// �art uymasa bile bir kere �al���r. do nun i�erisindekini yerine getirir.
	
	}

}
