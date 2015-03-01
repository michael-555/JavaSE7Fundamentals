/**
 *
 * @author Mikael Ottosson
 */
public class Clock {
    public int currentTime = 1205;
    
    public void displayPartOfDay() {
      if (currentTime >= 801 && currentTime <= 1200) {
          System.out.println("Good morning, the time is: " + currentTime);
      } else if (currentTime >= 1201 && currentTime <= 1700) {
          System.out.println("Good afternoon, the time is: " + currentTime);
      } else if (currentTime >= 1701 && currentTime <= 2400) {
          System.out.println("Good evening, the time is: " + currentTime);
      } else if (currentTime >= 1 && currentTime <= 800) {
          System.out.println("Good early morning, the time is: " + currentTime);
      }  
    }
}
