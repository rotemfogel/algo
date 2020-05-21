package me.rotemfo.sort;

public class MergeSort extends Sorter {
    public static void merge(int[] arr, int low, int mid, int high) {
        // Creating temporary sub-arrays
        int[] l = new int[mid - low + 1];
        int[] r = new int[high - mid];

        // Copying our sub-arrays into temporaries
        for (int i = 0; i < l.length; i++)
            l[i] = arr[low + i];
        for (int i = 0; i < r.length; i++)
            r[i] = arr[mid + i + 1];

        // Iterators containing current index of temp sub-arrays
        int li = 0;
        int ri = 0;

        // Copying from leftArray and rightArray back into array
        for (int i = low; i < high + 1; i++) {
            // If there are still un-copied elements in R and L, copy minimum of the two
            if (li < l.length && ri < r.length) {
                if (l[li] < r[ri]) {
                    arr[i] = l[li];
                    li++;
                } else {
                    arr[i] = r[ri];
                    ri++;
                }
            } else if (li < l.length) {
                // If all elements have been copied from rightArray, copy rest of leftArray
                arr[i] = l[li];
                li++;
            } else if (ri < r.length) {
                // If all elements have been copied from leftArray, copy rest of rightArray
                arr[i] = r[ri];
                ri++;
            }
        }
    }

    private static int[] mergeSort(final int[] arr, final int l, final int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
        return arr;
    }

    public static int[] sort(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return arr;
        }
        if (isSorted(arr, n)) return arr;
        return mergeSort(arr, 0, n - 1);
    }
}
