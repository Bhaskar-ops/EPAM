package dsa.sorting;
/*
Pass 1
5 1 4 2

5 > 1 → swap
1 5 4 2

5 > 4 → swap
1 4 5 2

5 > 2 → swap
1 4 2 5

Largest element fixed:

1 4 2 | 5
Pass 2
1 4 2 5

4 > 2 → swap

1 2 4 5
Pass 3

Already sorted.

Bubble Sort Complexity

Best case:

O(n)

Worst/Average:

O(n2)

Space:

O(1)
*/

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2};
        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for(int j = 0; j < n - i - 1; j++) {

                if(arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if(!swapped) {
                break;
            }
        }
    }
}
