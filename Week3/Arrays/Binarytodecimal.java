import java.util.*;
public class Binarytodecimal 
{
    public static int getDecimal(int binary){  
        int decimal = 0;  
        int n = 0;  
        while(true){  
          if(binary == 0){  
            break;  
          } else {  
              int temp = binary%10;  
              decimal += temp*Math.pow(2, n);  
              binary = binary/10;  
              n++;  
           }  
        }  
        return decimal;  
    }  
    public static void main(String args[])
    {    
    int number;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number you want to convert");
    number = sc.nextInt();
    System.out.println("Decimal of "+ number + "is: "+getDecimal(number));  
     
    }
}
