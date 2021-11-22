import java.util.*;
public class max
 {
    public static int maximum (int a,int b,int c)
    {
      int large = a;
      if (b>large)
      {
          large = b;
      }
      else if(c>large)
      {
          large = c;
      }
      return large;
    }
    public static void main(String args[])
    {
        int x,y,z;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st number");
        x = sc.nextInt();
        System.out.println("Enter 2nd number");
        y = sc.nextInt();
        System.out.println("Enter 3rd number");
        z = sc.nextInt();
        System.out.println("Maximum of the given numbers are = "+maximum(x,y,z));
    }
}
