import java.util.*;
public class grades 
{
    public static void value(int x)
    {
        System.out.print("The student Grade is : ");
        if(x>=80)
        {
            System.out.print("A");
        }
        else if(x>=60 && x<80)
        {
           System.out.print("B");
        } 
        else if(x>=40 && x<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("Invalid value");
        }
    }
    public static void main(String args[])
    {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        marks = sc.nextInt();
        value(marks);
    }
}
