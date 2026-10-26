package dsa.twopointer.arraystringdeepdive;

import java.util.Arrays;

//Input: nums = [3,2,2,3], val = 3
//Output: 2, nums = [2,2,_,_]
//Explanation: Your function should return k = 2, with the first two elements of nums being 2.
//It does not matter what you leave beyond the returned k (hence they are underscores).
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2}; int val = 2;
        //problem could also be done 2 pointer, but this is a much easy solution.
        int k = removeElement(nums, val);
        System.out.println(k);
    }
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        int left = 0;

        while(left < nums.length){
            if(nums[left] != val){
                nums[k++] = nums[left];
            }
            left++;
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
