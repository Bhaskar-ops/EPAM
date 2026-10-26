package dsa.twopointer;

import java.util.Arrays;
//input: numbers = [2,7,11,15], target = 9
//Output: [1,2]
//Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

public class twoSumSortedArr {
    public static void main(String[] args) {
        int target = 6;
        int[] numbers = {2, 3, 4};
        int[]  res = twoSum(numbers, target);
        System.out.println(Arrays.toString(res));
    }
    public static int[] twoSum(int[] numbers, int target) {

        int l = 0;
        int r = numbers.length -1;
        while(l<r){
            int sum = numbers[l] + numbers[r];
            if(sum == target){
                return new int[]{l+1, r+1};
            }else if(sum>target){
                r--;
            }else l++;
        }
        return new int[]{};
    }
}
