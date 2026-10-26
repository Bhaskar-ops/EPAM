package dsa.hashmapAndHashSet;

import java.util.*;
//49.
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] stArr = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(anagramPair(stArr));
    }
    public static List<List<String>> anagramPair(String[] stArr){
        Map<String, List<String>> map = new HashMap<>();
        for(String str : stArr){
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            String sortedStr = new String(chArr);
//            if(map.containsKey(sortedStr)){
//                map.get(sortedStr).add(str);
//            }else{
//                map.put(sortedStr, new ArrayList<>());
//                map.get(sortedStr).add(str);
//            }
            map.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
