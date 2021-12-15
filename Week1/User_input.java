import java.util.Scanner;
public class User_input
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the numbers");
       int n1 = sc.nextInt();
    int n2 = sc.nextInt();

    if (n1>n2)
    {
        System.out.println(n1+ " is highest");

    }
else 
{
    System.out.println(n2+" is highest number");
}
   } 
}
