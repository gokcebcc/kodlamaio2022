package odev_2;

public class ReCapDemo1 {
	public static void main(String[] args) {
		
		int sayi1 = 30;
		int sayi2 =25;
		int sayi3 = 2;
		
		// say�lar aras�ndan en b�y���n� bul
		 int enBuyuk = sayi1;
		 
		 if (enBuyuk < sayi2) {
			 enBuyuk = sayi2;
			
		}
		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
			
			
		}
		System.out.println("En b�y�k say�: "+enBuyuk);
	}

}
