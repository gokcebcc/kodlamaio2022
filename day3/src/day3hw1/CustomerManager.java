package day3hw1;

public class CustomerManager {

	//public void Save(int id, String firstName, String lastName, String nationalIdentity) {
//bunu kullanmak yerine burada encapsulation devreye giriyor.
	//}
	private Customer _customer;
	public void Save(Customer customer) {
		
		System.out.println("Müþteri kaydedildi :"+customer.getId()+" "+customer.getFirstName()+" "+customer.getLastName()+" "+customer.getCityName());
	
	}
	
	public void Delete(Customer customer) {
		System.out.println("Müþteri silinci :"+customer.getId()+" "+customer.getFirstName()+" "+customer.getLastName()+" "+customer.getCityName());
	}
	
	
	private ICreditManager _creditManager;
	
	

	public CustomerManager(Customer customer, ICreditManager creditManager) {
		super();
		this._customer = customer;
		this._creditManager = creditManager;
	}
	
	public void GiveCredit() {
		
		_creditManager.Calculate();
		System.out.println("Kredi Verildi");
		
	}
	
	

}
