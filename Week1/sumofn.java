import java.util.Scanner;

import java.util.*;
public class sumofn
{
    public static void main(String args[])
    {
        int i,n,sum=0;
        System.out.println("Enter the number to sum");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=0;i<n;i++)
        {
            sum = sum +i;
        }
        System.out.println("Sum of the given number is = "+sum);
    }
}
