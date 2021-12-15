import java.util.*;
public class Swap 
{
   public static void main(String args[])
   {
       int a,b,temp=0;

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the first number");
       a = sc.nextInt();
       System.out.println("Enter the second number");
       b = sc.nextInt();
       System.out.println("Numbers before swapping\n a ="+a+"\n"+b);
       temp=a;
       a=b;
       b=temp;
       System.out.println("After the swap\n a ="+a+"b ="+b);


   }    
}
