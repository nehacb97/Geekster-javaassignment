import java.util.*;
public class EvenOdd 
{
    static void Oddeven(int num)
        {
        if(num%2==0) 
            System.out.println(num+" is even"); 
        else 
            System.out.println(num+" is odd");
        }
    public static void main (String args[]){
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter the number for check odd or even: ");
        int num=scan.nextInt();
        
        Oddeven(num);
        }
        
        
}
