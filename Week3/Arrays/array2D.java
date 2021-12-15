import java.util.*;
public class array2D
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int n = arr.length;
        int m = arr[0].length; 

        System.out.println("Enter the elemets");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing  elements");
        {
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<m; j++)
                {
                    System.out.print(arr[i][j]);
                }
            }
        }
        System.out.println("Printing diagonal elements");
        {
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<m; j++)
                {
                    if(i==j)
                    {
                        System.out.print(arr[i][j]);
                    }
                    
                }
            }
        }
         sc.close();
    }
}
