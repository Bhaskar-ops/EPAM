package dsa.twopointer;

import java.util.Arrays;

//Problem:
//Move all 0s to the end while maintaining relative order of non-zero elements.
//Input:  [0, 1, 0, 3, 12]
//Output: [1, 3, 12, 0, 0]
public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int l =0;
        //0 -> 1,0 l1 then i =2 --> 1,0,0 l1then i = 3 --> 1,3,0,0 l2 then i = 4 --> 1,13,12,0,0
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[l];
                arr[l] = temp;
                l++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
