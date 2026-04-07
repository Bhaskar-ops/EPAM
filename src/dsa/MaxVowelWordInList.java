package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaxVowelWordInList {
	
	public static void main(String[] str) {
		List<String> list = Arrays.asList("gfg", "best", "for", "geeks", "geek", "geeo", "geeoks", "gfg");
		int maxCount = 0;
		List<String> resList = new ArrayList<>();
		for(String str1 : list) {
			int curr = countVowels(str1);
			if(curr > maxCount) {
				maxCount = curr;
				resList = new ArrayList<>();
				resList.add(str1);
			}else if(maxCount == curr) {
				resList.add(str1);
			}
		}
		System.out.println(resList);
	}
	
	static int countVowels(String str) {
		Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		int count = 0;
		for(char ch : str.toCharArray()) {
			if(set.contains(ch)) {
				count++;
			}
		}
		return count;
		
	}
}
