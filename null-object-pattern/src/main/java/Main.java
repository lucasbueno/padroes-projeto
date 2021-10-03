public class Main {
   public static void main(String[] args) {

      AbstractCustomer customer1 = CustomerDAO.getCustomer("Rob");
      AbstractCustomer customer2 = CustomerDAO.getCustomer("Bob");
      AbstractCustomer customer3 = CustomerDAO.getCustomer("Julie");
      AbstractCustomer customer4 = CustomerDAO.getCustomer("Laura");
      
      System.out.println("Customers");
      System.out.println(customer1.getName());
      System.out.println(customer2.getName());
      System.out.println(customer3.getName());
      System.out.println(customer4.getName());
      
      if(customer2 instanceof NullCustomer)
    	  System.out.println("É nulo");
   }
}