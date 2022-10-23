package classesWithAtttributes;

public class Product {

	// attribute | field
	private int id; // ürünü tanýmlayan uniq name;

	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String colour;
	private String kod; // kodun kullanýcý tarafýndan girilmesni istemiyorsam set kodunu silerim

	
	//hem parametreli hem de parametresiz constructor varsa overloading anlamna geliyor.
	public Product() {
		System.out.println("Yapýcý blok çalýþtý - parametresiz constructor");
	}
	
	

	public Product(int id, String name, String description, double price, int stockAmount, String colour) {
		System.out.println("Yapýcý blok çalýþtý. Parametreli constructor.");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.colour = colour;
	}



	// getters and setters

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getKod() {
		return this.name.substring(0, 1) + id; // kendim otomatik bir kod oluþturuyorum kullanýcý giriþi engellendi
	}

	// public void setKod(String kod) {
	// this.kod = kod;
	// }
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}