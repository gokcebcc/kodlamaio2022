package day3hw1.inheritance;

public class CustomerManager {
	
	private ICustomerDaI customerDaI;
	
	public CustomerManager(ICustomerDaI customerDaI) {
		
		this.customerDaI = customerDaI;
		
	}
	
	public void add() {
		//i� kodlar�
		customerDaI.Add();
	}

}
