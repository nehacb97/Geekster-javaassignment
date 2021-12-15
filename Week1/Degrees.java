import java.util.*;
public class Degrees
{
    public static void main (String args[])  
    { float Fahrenheit, Celsius;
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the degrees");
          Fahrenheit = sc.nextFloat();  
          Celsius  = ((Fahrenheit-32)*5)/9;  
          System.out.println("Temperature in celsius is: "+Celsius);  
    }
}
