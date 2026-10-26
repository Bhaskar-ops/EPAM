package dsa.twopointer;
/*  Given stock prices on different days, find the maximum profit by buying once and selling once.
Example:
Input:  [7,1,5,3,6,4]
Output: 5                   */
public class StockMaxProfit {
    public static void main(String[] args) {
        int[] arr = {7,5,3,8,4,15};
        //two pointer way
//        int maxProfit = 0;
//        int left = 0;
//        int right = 1;
//        while(right < arr.length){
//            if(arr[right] > arr[left]) {
//                int profit = arr[right] - arr[left];
//                maxProfit = Math.max(maxProfit, profit);
//                right++;
//            }else{
//                left = right;
//                right++;
//            }
//        }
//        System.out.println(maxProfit);
        //other way is to track the minimum
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int curr : arr){
            if(min > curr){
                min = curr;
            }
            int profit = curr - min;
            maxProfit = Math.max(maxProfit, profit);
        }
        System.out.println(maxProfit);

        //Best time to buy and sell stock
        /* You can buy and sell multiple times.
        Input:  [7,1,5,3,6,4] --> buy at 1 sell at 5 then buy at 3 and sell at 6
        Output: 7 */
        //greedy approach
        int[] newArr = {7,1,5,3,6,4};
        int totalProfit = 0;
        for(int i = 1; i<newArr.length; i++){
            if(newArr[i] > newArr[i-1]){
                totalProfit = totalProfit + newArr[i] - newArr[i-1];
            }
        }
        System.out.println(totalProfit);

        //Another way which I found better and did myself

//        int[] arr = {7,1,5,3,6,4};
//        int left = 0; int right = 1;
//        int totalProfit = 0;
//        while(right < arr.length){
//            if(arr[right] > arr[left]){
//                totalProfit = totalProfit + arr[right] - arr[left];
//                left++;
//                right++;
//            }else{
//                left = right;
//                right++;
//            }
//        }
//        System.out.println(totalProfit);

    }
}
