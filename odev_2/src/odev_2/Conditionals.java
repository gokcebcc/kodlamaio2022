package odev_2;

public class Conditionals {

	public static void main(String[] args) {
		
		// Conditionals = �artlar
		
		int sayi = 10;
		
		//1. y�ntem if   2. y�ntem switch
		
		if (sayi <20) {
			
			System.out.println("say� 20 den k���kt�r.");
			
		}else if (sayi >20) {
			System.out.println("sayi 20 den k���k de�ildir");
			
		}else if (sayi == 20) {
			System.out.println("Sayi 20 ye e�ittir.");
			
		}else {
			System.out.println("Ge�ersiz say�!!!");
		}
			
		
	}
}
