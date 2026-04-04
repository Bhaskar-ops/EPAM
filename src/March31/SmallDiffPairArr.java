package March31;

import java.util.Arrays;

public class SmallDiffPairArr {
    /*
    Given two unsorted arrays, find a pair (one element from each array) whose absolute difference is minimum.
    arr1 = [1, 3, 15, 11, 2]
    arr2 = [23, 127, 235, 19, 8]
    [11, 8]   // difference = 3 (minimum)
     */
    public static void main(String[] args){

        int[] arr1 = {1, 3, 15, 11, 2};
        int[] arr2 = {23, 40, 4, 10, 7};
        int[] res = new int[2];
        int smallest = Integer.MAX_VALUE;
//        for(int i = 0; i < arr1.length; i++){                     //bruteforce n2
//            for(int j = 0; j < arr2.length; j++){
//                int diff = Math.abs(arr1[i] - arr2[j]);
//                if(smallest > diff){
//                    smallest = diff;
//                    res = new int[]{arr1[i], arr2[j]};
//                }
//            }
//        }
//        System.out.println(Arrays.toString(res));
        Arrays.sort(arr1);   //{1, 2, 3, 11, 15}
        Arrays.sort(arr2);   //{7, 8, 10, 23, 40}
        int i =0, j =0;
        while(i < arr1.length && j < arr2.length){
            int diff = Math.abs(arr1[i] - arr2[j]);
            if(smallest > diff){
                smallest = diff;
                res = new int[]{arr1[i], arr2[j]};
            }
            if(arr1[i]> arr2[j]){
                 j = j + 1;
            }else if(arr1[i] < arr2[j]){
                i = i + 1;
            }else{
                break; // both are same hence min is 0
            }
        }
        System.out.println(Arrays.toString(res)); // time complexity is nlogn because of sorting.
    }
}
