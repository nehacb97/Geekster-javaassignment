import java.util.*;
public class Factorialprogram
{
    public static int fact(int x)
    {
        int factorial = 1;
        int i = 1;
        do
        {
            factorial = factorial * i;
            i++;
        } while (i <= x);

        return factorial;
    }
    public static void main(String[] args)
    {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        number = sc.nextInt();
        System.out.println("Factorial of given number "+fact(number));
        char x;
        System.out.println("Want to continue(Y/N)");
        x = sc.next().charAt(0);
        if(x=='y'||x=='Y')
        {
            System.out.println("Enter the number");
        number = sc.nextInt();
        System.out.println("Factorial of given number "+fact(number));
        }
    }
}
