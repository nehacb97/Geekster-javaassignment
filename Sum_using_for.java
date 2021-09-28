import java.util.Scanner;

public class Sum_using_for {
	 public static void main(String args[])
	  {
		  int n,i;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of elements you want ");
			n = sc.nextInt();
			int array[] = new int[n];
			System.out.println("Enter the array elements");
			for(i=0;i<n;i++)
			{
				array[i] = sc.nextInt();
			}
			int sum = 0;
			for(i=0;i<n;i++)
			{
				sum=sum+array[i];
			}
			
			System.out.println("The sum of given numbers is :"+sum);
	  }
}
