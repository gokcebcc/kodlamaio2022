package odev2;

public class Methods {

	public static void main(String[] args) {

		sayiBulmaca();
		

	}
	//fonksiyon isimleri Camel Case
	// class isimleri pascal Case yaz�l�r.

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 6;
		boolean varMi = false;
		

		for (int sayi : sayilar) {

			if (sayi == aranacak) {
				varMi = true;
				break;

			}
		}
		if (varMi) {
			mesajVer("Sayi mevcuttur."+aranacak);

		} else {
			mesajVer("Say� mevcut de�ildir."+aranacak);
		}
	}
	public static void mesajVer(String mesaj) {

		System.out.println(mesaj);

	
	}

}
