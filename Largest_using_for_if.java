import java.util.Scanner;

public class Largest_using_for_if {
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
		int largest = 0;
		for(i=0;i<n;i++)
		{
			if(array[i]>largest)
			{
				largest = array[i];
			}
		}
		
		System.out.println("The largest number among the given numbers is :"+largest);
	}

}
