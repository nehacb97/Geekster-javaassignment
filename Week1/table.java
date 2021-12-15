import java.util.Scanner;

public class table 
{
    public static void main(String args[])
    {
        int n,i,prod;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to print multiples of = ");
        n = sc.nextInt();
        prod =n;
        for(i=1;i<=10;i++)
        {
          prod = prod*i;
          System.out.println(n+" * "+i+" = "+prod);
          prod =n;
        }
    }
}
