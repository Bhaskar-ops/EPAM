package dsa.twopointer;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while(l<r){
            while(l<r && !Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            char leftChar = Character.toLowerCase(s.charAt(l));
            char rightChar = Character.toLowerCase(s.charAt(r));
            if(leftChar != rightChar){
                return false;
            }
            r--;
            l++;
        }
        return true;
    }
}
