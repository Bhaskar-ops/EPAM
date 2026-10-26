package dsa.hashmapAndHashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//128. Longest Consecutive Sequence
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutiveSortingSolution(nums));
        System.out.println(longestConsecutive(nums));
    }
    //nlogn solution
    public static int longestConsecutiveSortingSolution(int[] nums) {
        Arrays.sort(nums);
        int longest = 0;
        int currentStreak = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i-1] == nums[i]){
                continue;
            }
            if(nums[i-1] + 1 == nums[i]){
                currentStreak++;
            }else{
                longest = Math.max(longest, currentStreak);
                currentStreak = 1;
            }
        }
        longest = Math.max(longest, currentStreak);
        return longest;
    }
    //O(n) solution
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int longest = 0;
        for(int n : set){
            if(!set.contains(n-1)){
                int currentNum = n;
                int currentStreak = 1;
                while(set.contains(currentNum + 1)){
                    currentNum++;
                    currentStreak++;
                }
                longest = Math.max(longest, currentStreak);
            }
        }
        return longest;
    }
}
