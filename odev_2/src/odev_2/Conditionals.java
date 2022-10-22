package odev_2;

public class Conditionals {

	public static void main(String[] args) {
		
		// Conditionals = þartlar
		
		int sayi = 10;
		
		//1. yöntem if   2. yöntem switch
		
		if (sayi <20) {
			
			System.out.println("sayý 20 den küçüktür.");
			
		}else if (sayi >20) {
			System.out.println("sayi 20 den küçük deðildir");
			
		}else if (sayi == 20) {
			System.out.println("Sayi 20 ye eþittir.");
			
		}else {
			System.out.println("Geçersiz sayý!!!");
		}
			
		
	}
}
