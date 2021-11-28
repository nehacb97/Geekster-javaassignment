public class reverse 
{
    public static void main(String args[]) {
        String s[] = "you shall pass".split(" "); 
        String ans = ""; 
        for (int i = s.length - 1; i >= 0; i--) { 
          ans += s[i] + " "; 
        } 
        System.out.println("Reversed String: " + ans); 
      }
}
