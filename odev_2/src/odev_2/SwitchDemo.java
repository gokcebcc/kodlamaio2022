package odev_2;

public class SwitchDemo {
	public static void main(String[] args) {

		// if bloklar�na g�re daha az kullan�l�r.
		// switch bloklar�yla dalland�rma yap�yoruz.

		char grade = 'B';
		switch (grade) {
		case 'A':
			System.out.println("M�kemmel! : Ge�tiniz");

			break;
		case 'B':// b ve c nin sonucunda ayn� yan�t� verdi
			
		case 'C':
			System.out.println("�yi : Ge�tiniz");
			break;
		case 'D':
			System.out.println("Fena de�il : Ge�tiniz");
			break;
		case 'F':
			System.out.println("Maalesef kald�n�z!");
			break;

		default:
			System.out.println("Ge�ersiz not girdiniz!!!");
			break;
		}

	}

}
