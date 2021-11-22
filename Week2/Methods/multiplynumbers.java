import java.util.Scanner;

public class multiplynumbers 
{
  public static int mul (int a,int b)
  {
     int x;
     x=a*b;
     return x;
  }  
  public static void main(String args[])
  {
      int n1,n2,x;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the 1 number");
      n1 = sc.nextInt();
      System.out.println("Enter the 2 number");
      n2 = sc.nextInt();
      x = mul(n1,n2);
      System.out.println("Multiple of the entered number = "+x);
  }  
}
