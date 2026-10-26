package dsa.hashmapAndHashSet;
//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//s and t consist of lowercase English letters.

public class ValidAnagramBoolean {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
    static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
