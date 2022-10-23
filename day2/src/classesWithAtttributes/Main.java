package classesWithAtttributes;

public class Main {
	public static void main(String[] args) {
		
		Product product = new Product()	;
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		
		System.out.println(product.getName());
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		productManager.Add2(1, "", "", 3, 5000);
		//�r�n�n fiyat�na s�n�r koymak mesela eksi de�er giremeyece�ini belirtmek i�in yine encapsulation kullan�yorum.
		//public her yerden eri�ilebilir demek.
		//c# da default private gelir.
		//private sadece tan�mland��� blokta ge�erlidir demek.
		
		
		//�r�n�n kodunu giremiyorum ama okuyabilirim.
		System.out.println("�r�n�n kodu: "+product.getKod());
		
		
	}

}
