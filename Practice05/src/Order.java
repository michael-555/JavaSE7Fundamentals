/**
 *
 * @author Mikael Ottosson
 */
public class Order {
    public long orderValue = 0L;
    public int itemQuantity = 10_000_000;
    public int itemPrice = 555_500;
    
    public void calculateTotal() {
        orderValue = (long)itemQuantity * itemPrice; // Casting the output of the ordervalue
        System.out.println("The total order value is: " + orderValue);
    }
}
