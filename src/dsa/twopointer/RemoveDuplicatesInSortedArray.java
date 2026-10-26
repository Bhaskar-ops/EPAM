package dsa.twopointer;

import java.util.Arrays;

//Given a sorted array, remove duplicates in-place such that each element appears only once.
//Return the number of unique elements.
//Input:[1,1,2,2,3,4,4]
//Output:[1,2,3,4]
public class RemoveDuplicatesInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4};
        int slow= 0;
        for(int i =1; i<arr.length; i++){
            if(arr[i] != arr[slow]){
               slow++;
               arr[slow] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        // question would require to return the count of uniques which is slow +1.
    }
}
