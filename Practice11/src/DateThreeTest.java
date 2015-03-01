

/**
 *
 * @author Mikael Ottosson
 */

public class DateThreeTest {
  public static void main(String args[]){
      DateThree date = new DateThree();
      
      date.setDay(10);
      date.setMonth(12);
      date.setYear(2014);
      
      System.out.println("The date is: " + date.getYear() + "-" + date.getMonth() + "-" + date.getDay());
      
      date.setDate(30, 12, 2011);
      date.displayDate();
      
      date.setDate(30, 14, 2011);
      date.displayDate();
      
      date.setDate(35, 12, 2011);
      date.displayDate();
      
      date.setDate(30, 12, 200);
      date.displayDate();
  } // end main
} // end class
