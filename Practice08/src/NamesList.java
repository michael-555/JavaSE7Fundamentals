
import java.util.ArrayList;


/**
 *
 * @author Mikael Ottosson
 */
public class NamesList {
    public ArrayList listOfNames;
    
    public void setList() {
        listOfNames = new ArrayList();
        listOfNames.add("Joe Smith");
        listOfNames.add("Mary Palmer");
        listOfNames.add("Jose Gonzalez");
        listOfNames.add("Linda Baker");
        
        System.out.println("Names list: " + listOfNames);
        System.out.println("Size of the ArrayList: " + listOfNames.size());
    }
    
    public void manipulateList() {
        listOfNames.remove("Joe Smith");
        System.out.println("Names of the list after removing element: " + listOfNames);
        System.out.println("Size of ArrayList: " + listOfNames.size());
        listOfNames.add(1, "Joe Smith");
        System.out.println("Names listed after adding element: " + listOfNames);
        System.out.println("Size of ArrayList: " + listOfNames.size());
        
    }
}

