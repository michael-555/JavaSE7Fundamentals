/**
 *
 * @author Mikael Ottosson
 */
public class VacationScale {
    // Declare two arrays
    int [] vacationDays;
    int yearsOfService;
    
    public void setVacationScale() {
        // Initializing size for vacation array
        vacationDays = new int[7];
        
        // Initializing values for vacation array
        vacationDays[0] = 10;
        vacationDays[1] = 15;
        vacationDays[2] = 15;
        vacationDays[3] = 15;
        vacationDays[4] = 20;
        vacationDays[5] = 20;
        vacationDays[6] = 25;
    }
    
    public void displayVacationDays() {
            if(yearsOfService >= 0 && yearsOfService < 6) {
                System.out.println("Days of Vacation: " + vacationDays[yearsOfService]);
            } else if(yearsOfService >= 6){
                System.out.println("Days of vacation: " + vacationDays[6]);
            }
            else {
                System.out.println("Invalid years of service");
            }
    }
 }
