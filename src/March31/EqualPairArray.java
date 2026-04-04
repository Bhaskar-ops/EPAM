package March31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualPairArray {
    public static void main(String[] args){
        /*
            The task is to print all unique pairs in the unsorted array with equal sum. * *
            Ex: * Input = [1,2,3,4,5]
            output = [ (1,4),(2,3)], [(1,5),(2,4)], [(2,5), (3,4)]
        **/
        int[] arr = {1,2,3,4,5,6};
        Map<Integer, List<int[]>> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j< arr.length; j++){
                int sum = arr[i] + arr[j];
                int[] currentPair = new int[]{arr[i], arr[j]};
                if(map.containsKey(sum)){
                    for(int[] pair : map.get(sum)){
                        System.out.println("[(" + pair[0] + ", " + pair[1] + "), " + "(" + currentPair[0] + ", " + currentPair[1] + ")]");
                    }
                }
                map.computeIfAbsent(sum, k -> new ArrayList<>()).add(currentPair);
            }
        }
    }
}
