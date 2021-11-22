import java.util.*;
public class numberofdigits
 {
    public static void main(String[] args) {
        int count = 0, num, n ;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to count its digits:");
        n = input.nextInt();
        num = n;
        while(num != 0)
        {
        num = num/10;
        count++;
        }
        System.out.println("Number of digits: " + count);
    }
}
