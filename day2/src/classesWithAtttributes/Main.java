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
		//ürünün fiyatýna sýnýr koymak mesela eksi deðer giremeyeceðini belirtmek için yine encapsulation kullanýyorum.
		//public her yerden eriþilebilir demek.
		//c# da default private gelir.
		//private sadece tanýmlandýðý blokta geçerlidir demek.
		
		
		//ürünün kodunu giremiyorum ama okuyabilirim.
		System.out.println("Ürünün kodu: "+product.getKod());
		
		
	}

}
