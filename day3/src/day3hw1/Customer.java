package day3hw1;

public class Customer {
	
	private int id;
	private String firstName;
	private String lastName;
	//private String NationalIdentity;
	private String cityName;
	
	
	
	
	public Customer() {
		System.out.println("Müþteri nesnesi baþlatýldý.");
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/*
	 * public String getNationalIdentity() { return NationalIdentity; } public void
	 * setNationalIdentity(String nationalIdentity) { NationalIdentity =
	 * nationalIdentity; }
	 */
	
	
	

}
