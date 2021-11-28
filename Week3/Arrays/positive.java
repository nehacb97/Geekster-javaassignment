import java.util.*;
public class positive 
{
    public static void main(String args[])
    {
        int []arr = new int [10];
      int n = arr.length;
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter the array elements");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
            
        }
        
        System.out.println("Positive numbers present in the array");
        for( int i=0; i<n; i++)
        {
            if(arr[i]>=0)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
