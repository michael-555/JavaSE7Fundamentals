/**
 *
 * @author Mikael Ottosson
 */
public class Customer {
    public int customerID = 0;
    public String name = "-name required-";
    public String address = "-address recuired-";
    public String phoneNumber = "-phone required-";
    public String eMail = "-email optional-";
    
    public void setCustomerInfo(int Id, String nm, String addr, String phNum) {
        customerID = Id;
        name = nm;
        address = addr;
        phoneNumber = phNum;
        
    }
    
    public void setCustomerInfo(int Id, String nm, String addr, String phNum, String email) {
        customerID = Id;
        name = nm;
        address = addr;
        phoneNumber = phNum;
        eMail = email;
    }
    
    public void display() {
        System.out.println("Customer ID: " + customerID);
        System.out.println("Customer name: " + name);
        System.out.println("Customer address: " + address);
        System.out.println("Customer phone: " + phoneNumber);
        System.out.println("Customer email: " + eMail);
    }
}
