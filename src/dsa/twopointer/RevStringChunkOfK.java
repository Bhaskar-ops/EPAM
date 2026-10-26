package dsa.twopointer;
//Reverse String in Chunks of K
//String = "abcdefgh"
//k = 3
//Output: "cbafedhg"
public class RevStringChunkOfK {
    public static void main(String[] args) {
        String str = "abcdefghij";
        char[] chars = str.toCharArray();
        int k = 4;
        for(int i =0; i<chars.length; i +=k){
            int left = i;
            int right = Math.min(left + k -1, chars.length - 1);
            while(left < right){
                char temp = chars[right];
                chars[right] = chars[left];
                chars[left] = temp;
                left++;
                right--;
            }
        }
        System.out.println(new String(chars));
    }
}
