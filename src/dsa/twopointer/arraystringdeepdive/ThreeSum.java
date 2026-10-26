package dsa.twopointer.arraystringdeepdive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//skipping logic examples why required
//[-1,-1,-1,0,1,2] --> for duplicate i
//[-2,0,0,0,2,2] --> duplicate left values
public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i<nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            while(left<right){
                if(nums[i] + nums[left] + nums[right] == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left<right && nums[right] == nums[right+1]){
                        right--;
                    }
                }else if(nums[i] + nums[left] + nums[right] < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return result;
    }
}
