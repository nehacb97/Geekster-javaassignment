import java.util.*;
public class product
{
    public static void main(String args[])
    {
       int x;
       float m;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter integer number");
       x = sc.nextInt();
       System.out.println("Enter float number");
       m = sc.nextFloat();
       float prod=0;
       prod = (x*m);
       System.out.println("Product of the given numbers = "+prod);
    }
}
