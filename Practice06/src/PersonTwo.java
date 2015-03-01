/**
 *
 * @author Mikael Ottosson
 */
public class PersonTwo {
    public StringBuilder name = new StringBuilder(8);
    public StringBuilder phoneNumber = new StringBuilder();
    
    public void displayPersonInfo() {
        // Populating the name object
        name.append("Mikael");
        name.append(" ");
        name.append("Ottosson");
    
        // Display name object
        System.out.println("Name: " + name.toString());
        System.out.println("Name object capacity: " + name.capacity());
        
        // Populate the phone number object
        phoneNumber.append("0727320100");
        phoneNumber.insert(4, "-");
        phoneNumber.insert(8, " ");
        System.out.println("Phone number: " + phoneNumber.toString());
        
        // Get and display the firstname
        System.out.println("First Name: " + name.substring(0,8));
        
    }
   
}
