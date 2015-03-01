
/**
 *
 * @author Mikael Ottosson
 */
public class CustomerTest {

    
    public static void main(String[] args) {
       
        Customer cust1, cust2;
        cust1 = new Customer();
        cust2 = new Customer();
        
       //Assigning values to the member fields
       cust1.customerID = 1;
       cust1.name = "Mary Smith";
       cust1.emailAddress = "mary.smith@gmail.com";
       cust2.customerID = 2;
       cust2.name = "Frank Jones";
       cust2.emailAddress = "frank.jones@gmail.com";
       
       // cust2 = cust1; and with a little twist.
       cust1.displayCustomerInfo();
       cust2.displayCustomerInfo();
    }
}
