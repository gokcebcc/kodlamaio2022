package odev_2;

public class SwitchDemo {
	public static void main(String[] args) {

		// if bloklarýna göre daha az kullanýlýr.
		// switch bloklarýyla dallandýrma yapýyoruz.

		char grade = 'B';
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel! : Geçtiniz");

			break;
		case 'B':// b ve c nin sonucunda ayný yanýtý verdi
			
		case 'C':
			System.out.println("Ýyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena deðil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef kaldýnýz!");
			break;

		default:
			System.out.println("Geçersiz not girdiniz!!!");
			break;
		}

	}

}
