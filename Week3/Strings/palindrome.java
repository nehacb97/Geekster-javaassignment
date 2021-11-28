public class palindrome 
{
    public static void isPalindrome(String str) {
        int start=0;
        int end=str.length()-1;
        while(start<end) {
            if(str.charAt(start)!=str.charAt(end))
             {
                System.out.println("Not a palindorme");
                
            }
            start++;
            end--;
        }
        System.out.println(str+" is a palindorme");
    }
    public static void main(String[] args) {
        String s="NehaBhat";
        isPalindrome(s);
    }
}
