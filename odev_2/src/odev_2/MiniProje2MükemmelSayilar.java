package odev_2;

public class MiniProje2M�kemmelSayilar {

	public static void main(String[] args) {

		// M�kemmel sayi: kendinden ba�ka t�m pozitif tam say� b�lenlerinin toplam�
		// kendine e�itse m�kemmel sayidir

		int sayi = 28;
		int toplam = 0;

		if (sayi < 0) {
			System.out.println("Ge�ersiz sayi");

			return;
		}

		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam = toplam + i;

			}

		}
		if (toplam == sayi) {
			System.out.println("M�kemmel say�d�r");

		} else {
			System.out.println("M�kemmel say� de�ildir");
		}

	}
}
