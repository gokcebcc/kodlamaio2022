package odev_2;


public class StringsDemo {
	public static void main(String[] args) {
		String mesaj = "   Bugün hava çok güzel.";

		System.out.println(mesaj);
		/*
		 * System.out.println("Eleman sayýsý: " + mesaj.length());
		 * System.out.println("Cümlenin 5. elemaný: " + mesaj.charAt(4));
		 * System.out.println(mesaj.concat(" Yaþasýn!"));
		 * System.out.println(mesaj.startsWith("A"));
		 * System.out.println(mesaj.endsWith("."));
		 * 
		 * char[] karakterler = new char[5]; mesaj.getChars(0,5,karakterler,0);
		 * 
		 * System.out.println(karakterler);
		 */

		String yeniMesaj = mesaj.replace(' ','-');
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2));//g den itibaren parçala
		//istediðim index e kadar kesmesini istersem;
		System.out.println(mesaj.substring(2,5));
		
		//split fonks
		//metini parçalarken boþluk karakterlerine bakarak parçalýyor dizi döndürüyor.
		
		for(String kelime:mesaj.split( " ")) {
			System.out.println(kelime);
			
		}
		
		//aramalarda sýklýkla kullanýlýr llower ve upper case
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		//cümlenin baþýndaki boþluklarý silmek için;
		System.out.println(mesaj.trim());
		
		
	}

}
