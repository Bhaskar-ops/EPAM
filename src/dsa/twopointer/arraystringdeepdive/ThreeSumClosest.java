package dsa.twopointer.arraystringdeepdive;

import java.util.Arrays;
//Input: nums = [-1,2,1,-4], target = 1
//Output: 2
//Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(arr, target));
    }
    public static int threeSumClosest(int[] nums, int target) {
        int closestSum = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-2; i++){
            int left = i+1;
            int right = nums.length -1;
            while(left < right){
                int currentSum = nums[i] + nums[left] + nums[right];
                if(Math.abs(target - currentSum) < Math.abs(target - closestSum)){
                    closestSum = currentSum;
                }
                if(currentSum < target){
                    left++;
                }else if(currentSum > target){
                    right --;
                }else{
                    return currentSum;                  //currentSum == target
                }
            }
        }
        return closestSum;
    }
}
