package odev2;

public class Methods2 {

	public static void main(String[] args) {
		
		String mesaj ="Bugün hava çok güzel!!";
		String yenimesaj = mesaj.substring(0, 3);   //0 dan 3 e kadar 3 dahil deðil
		
		System.out.println(yenimesaj);
		String yenimesaj2 = sehirVer();
		System.out.println(yenimesaj2);
		

		int sayi =topla(5,7);
		System.out.println(sayi);
		
		int toplam = topla2(2,3,4,5,6,8,9);
		System.out.println("Sayýlarýn toplamý = "+toplam);
		

		// operasyon method fonksiyon hepsi ayný(?)

	}

	// bir þey yapmasýný istediðin methodlar void
	// void olmak zorunda deðil datayý geri istediðinde void deðiþiyor deðer return
	// ediyor.
	public static void ekle() {
		System.out.println("Eklendi!");

	}

	public static void sil() {
		System.out.println("Silindi!");

	}

	public static void güncelle() {
		System.out.println("Güncellendi!");

	}
	public static int topla(int sayi1,int sayi2) {
		
		
		int toplam = sayi1+sayi2;
		return toplam;//bitir ama sayý döndür
	}
	
	public static int topla2(int... sayilar) {
		
		int toplam = 0;
		//elimde dizi olduðu için for döngüsü ile topladým
		for(int sayi:sayilar) {
			toplam+=sayi;
		}return toplam;
		
		
	}
	public static String sehirVer() {
		return "Ankara";
	}

}
