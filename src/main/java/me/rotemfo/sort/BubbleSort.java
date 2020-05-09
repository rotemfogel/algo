package me.rotemfo.sort;

public class BubbleSort extends Sorter {

    public static int[] sort(final int[] arr) {
        int n = arr.length;
        do {
            int nn = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    swap(arr, i - 1, i);
                    nn = i;
                }
            }
            n = nn;
        } while (n > 0);
        return arr;
    }
}
