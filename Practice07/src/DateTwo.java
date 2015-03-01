/**
 *
 * @author Mikael Ottosson
 */
public class DateTwo {
    public int dayNumber = 1;
    
    public void displayDay() {
        if(dayNumber == 1) {
            System.out.println("The day is: Monday");
            
        } else if (dayNumber == 2) {
            System.out.println("The day is: Tuesday");
            
        } else if (dayNumber == 3) {
            System.out.println("The day is: Wednesday");
            
        } else if (dayNumber == 4) {
            System.out.println("The day is: Thursday");
            
        } else if (dayNumber == 5) {
            System.out.println("The day is: Friday");
            
        } else if (dayNumber == 6) {
            System.out.println("The day is: Saturday");
            
        } else if (dayNumber == 7) {
            System.out.println("The day is: Sunday");
            
        } else {
            System.out.println("The day number is not valid.");
        }
    }    
}
