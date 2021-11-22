import java.util.*;
public class Ternarylargesttwonumbers 
{
    public static void main(String[] args) 
    {
        int a, b, d;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter  numbers:");
        a = s.nextInt();
        b = s.nextInt();
      
        d = (a > b ? a : b);
        System.out.println("Largest Number:"+d);
    }
}
