import java.util.*;
public class difference
{
    public static void main(String args[])
    {
        int []arr = new int[10];
        int []a1 = new int[10];
        int []r = new int [10];
        int n = arr.length;
        int m = a1.length;
        int z = r.length;

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first array elements");
        for(int i=0; i<n; i++)       
        {
           arr[i] = sc.nextInt();
        }
        System.out.println("Enter the 2nd array elements ");
        for(int i=0; i<m; i++)
        {
            a1[i] = sc.nextInt();
        }
        System.out.println("Difference between 2 arrays");
        for(int i=0; i<z; i++)
        {
            r[i] = arr[i]-a1[i];
            System.out.println(r[i]);
        }
    }
}
