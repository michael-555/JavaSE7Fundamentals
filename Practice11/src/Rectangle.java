
/**
 *
 * @author Mikael Ottosson
 */
public class Rectangle {

    private int width;
    private int height;

    public Rectangle() {
        this.width = 25;
        this.height = 10;

        System.out.println("Default rectangle created with the width: " + this.width + " and the height: " + this.height);
    }

    public Rectangle(int w, int h) {
        if (w > 0 && w < 30) {
            this.width = w;
        } else {
            System.out.println("The number for width is invalid!");
            this.width = 0;
        }
        if (h > 0 && h < 30) {
            height = h;
        } else {
            System.out.println("The number for height is invalid!");
            height = 0;
        }
        if(height != 0 && this.width != 0) {
            System.out.println("The rectangle has been created with the following: " + "Width: " + width + " Height: " + height);
        }
    }
    
    public int getArea() {
        return width * height;
    }
    
    public void draw(){
        for(int rowCounter=0; rowCounter < height; rowCounter++){
            for(int colCounter=0; colCounter < width; colCounter++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
