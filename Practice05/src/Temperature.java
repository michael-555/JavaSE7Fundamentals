/**
 *
 * @author Mikael Ottosson
 */
public class Temperature {
    public float farenheitTemp = 78.9F;
    
    public void calculateCelsius() {
        System.out.println ((farenheitTemp - 32) * 5 /9);
    }
    
}
