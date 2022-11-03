package day3hw1.inheritance;

import day3hw1.Customer;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDaI()) {
		};
		customerManager.add();
	}

}
