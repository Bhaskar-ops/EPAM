package dsa.hashmapAndHashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//349. Intersection of Two Arrays
//Given two integer arrays nums1 and nums2, return an array of their intersection.
// Each element in the result must be unique and you may return the result in any order.
//Example 1:
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]
//Example 2:
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [9,4]
//Explanation: [4,9] is also accepted.

public class IntersectionOfTwoArr {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9,4,9,8,4};
        int[] resultArr = intersection(nums1, nums2);
        System.out.println(Arrays.toString(resultArr));
        //Pattern Learned
        //Need unique elements + fast lookup → Think HashSet.
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> setNum = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for(int i : nums1){
            setNum.add(i);
        }
        for(int i : nums2){
            if(setNum.contains(i)){
                result.add(i);
            }
        }
        int[] resArr = new int[result.size()];
        int i = 0;
        for(int num : result){
            resArr[i] = num;
            i++;
        }
        return resArr;
    }
}
