/**
 *
 * @author Mikael Ottosson
 */
public class Customer {
    public int customerID = 0; // Default value for CustomerID
    public char status = 'N'; // Default value for the status
    public double totalPurchases = 0.0; // Default value for total Purchases
    
    public void displayCustomerInfo () {
        System.out.println("Customer id: " + customerID);
        System.out.println("Status: " + status);
        System.out.println("Total purchaces are: " + totalPurchases);
    }
}
