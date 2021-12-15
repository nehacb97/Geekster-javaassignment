import java.util.*;
public class Asciitochar 
{
    public static void main(String args[])
    {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        ch = sc.next().charAt(0);
        int x;
        x = ch;
        x = x+3;
         ch = (char)x;
        System.out.println("New character = "+ch);
    }
}
