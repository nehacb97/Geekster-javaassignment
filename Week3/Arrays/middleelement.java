import java.util.*;
public class middleelement
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
        System.out.print("The middle element of the given array : ");
        for(int i=0; i<n; i++)
        {
            if(i==5)
            {
                System.out.println(arr[i]);
                break;
            }
        }
  }  
}
