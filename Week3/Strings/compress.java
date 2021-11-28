import java.util.*;
public class compress 
{
        public static void main(String[] args) {
            String s1,s2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string");
            s1 = sc.nextLine();
            int n, count=1;
            n = s1.length();
            System.out.println("The compressed string is ");
            for(int i=1; i<n; i++)
            {
               char curr = s1.charAt(i);
               char pre = s1.charAt(i-1);
                
                if(curr == pre)
                {
                    count++;
                }
                else
                {
                  if(count >1)
                  {
                      s1 += curr;
                      count = 1;
                  }
                }
            }
            if(count >1)
                  {
                      s1 += count;
                      count = 1;
                  }
            System.out.println(s1);
            
        }
    }

