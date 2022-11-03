package day3hw1.inheritance;

public class MySqlCustomerDaI implements ICustomerDaI, IRepository {

	@Override
	public void Add() {
		System.out.println("MySQL eklendi.");
	}

}
