
/**
 *
 * @author Mikael Ottosson
 */
public class DateThree {

    private int day;
    private int month;
    private int year;

    // Getters end setters
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    
    public void setDate(int d, int m, int y) {
        if (y > 1000 && y < 10000) {
            this.year = y;
        } else {
            System.out.println(y + " is not a valid year");
            this.year = 0;
        }
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                this.month = m;
                if (d > 0 && d < 32) {
                    this.day = d;
                } else {
                    System.out.println(d + "  is not a valid day number for " + month);
                    this.day = 0;
                }
                break;
            case 2:
                this.month = m;
                if (d > 0 && d < 29) {
                    this.day = d;
                } else if (d == 29) {
                    if (((y % 4 == 0) && !(y % 100 == 0)) || (y % 400 == 0)) {
                        this.day = d;

                    } else {
                        System.out.println("Invalid day. " + "Day cannot be 29 unless the year is a leap year.");
                        this.day = 0;
                    }
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                this.month = m;
                if (d > 0 && d < 31) {
                    this.day = d;
                } else {
                    System.out.println("Invalid day. Must be 1 to 30.");
                    this.day = 0;
                }
                break;
            default:
                System.out.println(m + " is an invalid month.");
                this.month = 0;
                break;
       }
    }
    public void displayDate(){
        if(day == 0 || month == 0 || year == 0) {
            System.out.println("Invalid date.");
         
        } else {
            System.out.println("Date is: " + month + "/" + day + "/" + year);
        }
    }
}