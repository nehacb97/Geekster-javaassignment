import java.util.*;
public class multipledatatypes 
{
    public static int mul1 (int a,int b)
  {
     int x;
     x=a*b;
     return x;
  }  
  public static float mul2 (float a,float b)
  {
     float y;
     y=a*b;
     return y;
  }
  public static long mul3 (long a,long b)
  {
     long z;
     z=a*b;
     return z;
  }
  public static void main(String args[])
  {
      int n1,n2,x;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the 1 int number");
      n1 = sc.nextInt();
      System.out.println("Enter the 2 int number");
      n2 = sc.nextInt();
      x = mul1(n1,n2);
      System.out.println("Multiple of the entered number = "+x);
      float num1,num2,y;
      System.out.println("Enter the 1 float number");
      num1 = sc.nextFloat();
      System.out.println("Enter the 2 float number");
      num2 = sc.nextFloat();
      y = mul2(num1,num2);
      System.out.println("Multiple of the entered number = "+y);
      long ln1,ln2,z;
      System.out.println("Enter the 1 long number");
      ln1 = sc.nextLong();
      System.out.println("Enter the 2nd long number");
      ln2 = sc.nextLong();
      z = mul3(ln1,ln2);
      System.out.println("Multiple of the entered number = "+z);
  }
}
