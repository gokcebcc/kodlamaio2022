package odev_2;

public class MiniProje2MükemmelSayilar {

	public static void main(String[] args) {

		// Mükemmel sayi: kendinden baþka tüm pozitif tam sayý bölenlerinin toplamý
		// kendine eþitse mükemmel sayidir

		int sayi = 28;
		int toplam = 0;

		if (sayi < 0) {
			System.out.println("Geçersiz sayi");

			return;
		}

		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam = toplam + i;

			}

		}
		if (toplam == sayi) {
			System.out.println("Mükemmel sayýdýr");

		} else {
			System.out.println("Mükemmel sayý deðildir");
		}

	}
}
