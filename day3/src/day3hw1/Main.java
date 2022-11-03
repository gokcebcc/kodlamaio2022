
 package day3hw1;
 
 public class Main { public static void main(String[] args) {
 /*
 * 
 * int sayi1 = 10; int sayi2 = 20; sayi1 = sayi2; sayi2=100;
 * System.out.println(sayi1); //answer:20 //deðer ve referans tipler: // int
 * deðer tiptir.
 * 
 * 
 * CreditManager creditManager = new CreditManager(); creditManager.Calculate();
 * creditManager.Save();
 * 
 * Customer customer = new Customer(); customer.setId(1);
 * customer.setFirstName("Gokce"); customer.setLastName("Ozturk");
 * //customer.setNationalIdentity("11111111111");
 * 
 * 
 * 
 * //CustomerManager customerManager = new CustomerManager();
 * //customerManager.Save(1, "ayse", "gatma", "123456789111"); Customer
 * customer2 = new Customer(); customer2.setId(2);
 * 
 * 
 * @Override public void Save() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public void Calculate() { // TODO Auto-generated method stub
 * 
 * } }); customerManager.Save(customer); customerManager.Save(customer2);
 * customerManager.Delete(customer2);
 * 
 * Company company = new Company(); company.taxNumber = "1681115541";
 * 
 * 
 * 
 * 
 * }
 * 
 * }
 * 
 **/ 
 
 CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager()); 
 
 
 

 
 }}
 