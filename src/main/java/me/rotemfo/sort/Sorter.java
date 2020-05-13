package me.rotemfo.sort;

class Sorter {
    protected static void swap(final int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


    protected static boolean isSorted(final int[] arr, final int n) {

        // Array has one or no element or the
        // rest are already checked and approved.
        if (n == 1 || n == 0)
            return true;

        // check end of array
        if (arr[n - 1] < arr[n - 2])
            return false;

        // Last pair was sorted
        // Keep on checking
        return isSorted(arr, n - 1);
    }

    protected static boolean isSorted(final int[] arr) {
        return isSorted(arr, arr.length);
    }
}
