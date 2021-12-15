import java.util.*;
public class ASCII 
{
    public static void main(String args[])
    {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        ch = sc.next().charAt(0);
        int x;
        x = ch;
        System.out.println("Ascii value = "+x);
    }

}
