package inheritanceDemo;

public class Main {

	public static void main(String[] args) {

		
		// yaz�l�mda en �nemli olgu de�i�imdir. program de�i�ime direnmeyecek.
		// m��terinin zamanla de�i�en taleplerine yan�t verebilmeliyiz.
		// clean code prensibi burada �nemli!!!
		
		//OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		//ogretmenKrediManager.Hesapla();
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());//polymorphism
	}

}
