
/**
 *
 * @author Mikael Ottosson
 */
public class Month {

    public int monthNumber = 12;

    public void displayMonth() {

        switch (monthNumber) {
            case 1:
                System.out.println("The month is: Januari");
                break;
            case 2:
                System.out.println("The month is: Februari");
                break;
            case 3:
                System.out.println("The month is: March");
                break;
            case 4:
                System.out.println("The month is: April");
                break;
            case 5:
                System.out.println("The month is: May");
                break;
            case 6:
                System.out.println("The month is: June");
                break;
            case 7:
                System.out.println("The month is: July");
                break;
            case 8:
                System.out.println("The month is: August");
                break;
            case 9:
                System.out.println("The month is: September");
                break;
            case 10:
                System.out.println("The month is: October");
                break;
            case 11:
                System.out.println("The month is: November");
                break;
            case 12:
                System.out.println("The month is: December");
                break;
            default:
                System.out.println("Invalid month number");
                break;
        }
    }
}
