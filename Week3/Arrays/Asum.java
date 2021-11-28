import java.util.*;
public class Asum 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int n = arr.length;
        int sum=0;
        System.out.println("Enter the array elements");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

       
        System.out.print("The sum of the elements of the array : ");
        for(int i=0; i<n; i++)
        {
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}
