package dsa.twopointer.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "abcbcadaca";
        int left = 0;
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            while(set.contains(ch)){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(ch);
            maxLength = Math.max(maxLength, i - left + 1);
        }
        System.out.println("lengthOfLongestSubstring " + maxLength);
    }
}
