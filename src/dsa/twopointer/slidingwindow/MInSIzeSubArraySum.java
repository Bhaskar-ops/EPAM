package dsa.twopointer.slidingwindow;
//Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
//Input: target = 7, nums = [2,3,1,2,4,3]
//Output: 2
//Explanation: The subarray [4,3] has the minimal length under the problem constraint.
//Input: target = 4, nums = [1,4,4]
//Output: 1
//Input: target = 11, nums = [1,1,1,1,1,1,1,1]
//Output: 0
public class MInSIzeSubArraySum {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, arr));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        for(int i = 0; i<nums.length; i++){
            sum = sum + nums[i];
            while(sum >= target){
                minLength = Math.min(minLength, i - left + 1);
                sum = sum - nums[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
