package inheritanceDemo;

public class Main {

	public static void main(String[] args) {

		
		// yazýlýmda en önemli olgu deðiþimdir. program deðiþime direnmeyecek.
		// müþterinin zamanla deðiþen taleplerine yanýt verebilmeliyiz.
		// clean code prensibi burada önemli!!!
		
		//OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		//ogretmenKrediManager.Hesapla();
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());//polymorphism
	}

}
