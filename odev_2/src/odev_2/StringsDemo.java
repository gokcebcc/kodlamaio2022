package odev_2;


public class StringsDemo {
	public static void main(String[] args) {
		String mesaj = "   Bug�n hava �ok g�zel.";

		System.out.println(mesaj);
		/*
		 * System.out.println("Eleman say�s�: " + mesaj.length());
		 * System.out.println("C�mlenin 5. eleman�: " + mesaj.charAt(4));
		 * System.out.println(mesaj.concat(" Ya�as�n!"));
		 * System.out.println(mesaj.startsWith("A"));
		 * System.out.println(mesaj.endsWith("."));
		 * 
		 * char[] karakterler = new char[5]; mesaj.getChars(0,5,karakterler,0);
		 * 
		 * System.out.println(karakterler);
		 */

		String yeniMesaj = mesaj.replace(' ','-');
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2));//g den itibaren par�ala
		//istedi�im index e kadar kesmesini istersem;
		System.out.println(mesaj.substring(2,5));
		
		//split fonks
		//metini par�alarken bo�luk karakterlerine bakarak par�al�yor dizi d�nd�r�yor.
		
		for(String kelime:mesaj.split( " ")) {
			System.out.println(kelime);
			
		}
		
		//aramalarda s�kl�kla kullan�l�r llower ve upper case
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		//c�mlenin ba��ndaki bo�luklar� silmek i�in;
		System.out.println(mesaj.trim());
		
		
	}

}
