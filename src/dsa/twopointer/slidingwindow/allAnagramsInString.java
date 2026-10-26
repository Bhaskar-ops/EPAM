package dsa.twopointer.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//438. Find All Anagrams in a String
//Input: s = "cbaebabacd", p = "abc"
//        Output: [0,6]
//        Explanation:
//        The substring with start index = 0 is "cba", which is an anagram of "abc".
//        The substring with start index = 6 is "bac", which is an anagram of "abc".
public class allAnagramsInString {
    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc"));
    }
    public static List<Integer> findAnagrams(String s, String p) {
        int[] freqP = new int[26];
        int[] freqWindow = new int[26];
        List<Integer> res = new ArrayList<>();

        // Frequency of pattern
        for(int i =0; i<p.length(); i++){
            freqP[p.charAt(i) - 'a']++;
        }
        int left =0;
        for(int right =0; right<s.length(); right++){

            // Add current character to window
            freqWindow[s.charAt(right) - 'a']++;

            // Shrink window if size exceeds p.length()
            if((right - left + 1) > p.length()){
                freqWindow[s.charAt(left) - 'a']--;
                left++;
            }

            // Window size equals pattern size
            if(right - left + 1 == p.length()){
                if(Arrays.equals(freqP, freqWindow)){
                    res.add(left);
                }
            }
        }
        return res;
    }
}
