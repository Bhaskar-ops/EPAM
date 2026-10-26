package dsa.twopointer;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Input:
//nums = [1, 0, 1, 0, 0, 1]
//Output:[0, 0, 0, 1, 1, 1]
public class ShiftZeroes {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1};
        //two pass approach
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                arr[count++] = arr[i];
            }
        }
        for(int i = count; i<arr.length; i++){
            arr[count++] = 1;
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        // now using 2 pointers

        int[] arr2 = {1, 0, 1, 0, 0, 1};
        int j = 0;

//nums = [1, 0, 1, 0, 0, 1] --> 0, 1 j = 1 then i = 2 --> 0, 1, 1 j = 1 then i 3 --> 0, 0, 1,1 j=2
//        then i =4 --> 0,0,0,1,1 j =3 then i 5 --> no updation hence 000111
        for(int i = 0; i<arr2.length; i++){
            if(arr2[i] == 0){
                int temp = arr2[i];
                arr2[i] = arr2[j];
                arr2[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr2)); //short way to print a 1D array
    }
}
