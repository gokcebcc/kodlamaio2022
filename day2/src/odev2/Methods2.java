package odev2;

public class Methods2 {

	public static void main(String[] args) {
		
		String mesaj ="Bug�n hava �ok g�zel!!";
		String yenimesaj = mesaj.substring(0, 3);   //0 dan 3 e kadar 3 dahil de�il
		
		System.out.println(yenimesaj);
		String yenimesaj2 = sehirVer();
		System.out.println(yenimesaj2);
		

		int sayi =topla(5,7);
		System.out.println(sayi);
		
		int toplam = topla2(2,3,4,5,6,8,9);
		System.out.println("Say�lar�n toplam� = "+toplam);
		

		// operasyon method fonksiyon hepsi ayn�(?)

	}

	// bir �ey yapmas�n� istedi�in methodlar void
	// void olmak zorunda de�il datay� geri istedi�inde void de�i�iyor de�er return
	// ediyor.
	public static void ekle() {
		System.out.println("Eklendi!");

	}

	public static void sil() {
		System.out.println("Silindi!");

	}

	public static void g�ncelle() {
		System.out.println("G�ncellendi!");

	}
	public static int topla(int sayi1,int sayi2) {
		
		
		int toplam = sayi1+sayi2;
		return toplam;//bitir ama say� d�nd�r
	}
	
	public static int topla2(int... sayilar) {
		
		int toplam = 0;
		//elimde dizi oldu�u i�in for d�ng�s� ile toplad�m
		for(int sayi:sayilar) {
			toplam+=sayi;
		}return toplam;
		
		
	}
	public static String sehirVer() {
		return "Ankara";
	}

}
