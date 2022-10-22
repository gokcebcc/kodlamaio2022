package odev_2;

public class MiniProje3AsalSayi {

	public static void main(String[] args) {

		int number = -1;
		int reminder = number % 2;
		boolean isPrime = true;

		
		if (number <2) {
			System.out.println("Geçersiz sayý!!!");
			return;
			
		}

		System.out.println("kalan:" + reminder);
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;

			} 
			

		}
		if (isPrime) {
			System.out.println("Sayi asaldir");
			
		}else {
			System.out.println("Sayi asal deðildir");
		}
		

	}

}
