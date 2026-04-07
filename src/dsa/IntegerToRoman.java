package dsa;

import java.util.Scanner;

public class IntegerToRoman {
    public static void main(){
        int[] intArray = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] strArray = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = intArray.length-1; i>=0; i--){
            while(num >= intArray[i]){
                num -= intArray[i];
                sb.append(strArray[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
