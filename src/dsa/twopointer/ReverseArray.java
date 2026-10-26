package dsa.twopointer;

import java.util.Arrays;
import java.util.Set;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
//        int left = 0;
//        int right = arr.length -1;
//        while(left<right){
//            int temp = arr[right];
//            arr[right] = arr[left];
//            arr[left] = temp;
//            left++;
//            right--;
//        }
//        System.out.println(Arrays.toString(arr));
        // reverse string using 2 pointer
//        String str = "I am String";
//        int left = 0;
//        int right = str.length() -1 ;
//        char[] chars = str.toCharArray();
//        while(left < right){
//            char temp = chars[right];
//            chars[right] = chars[left];
//            chars[left] = temp;
//            left++;
//            right--;
//        }
//        System.out.println(new String(chars));
        //reverse only vowels in a string
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        String reverseVowel = "Hellosir";
        char[] chars = reverseVowel.toCharArray();
        int left = 0;
        int right = reverseVowel.length() -1;
        while(left<right){
            while(!vowels.contains(chars[left]) && left<right){
                left++;
            }
            while(!vowels.contains(chars[right]) && left<right){
                right--;
            }
            if(left < right){
                char temp = chars[right];
                chars[right] = chars[left];
                chars[left] = temp;
                left++;
                right--;
            }
        }
        System.out.println(new String(chars));
    }
}
