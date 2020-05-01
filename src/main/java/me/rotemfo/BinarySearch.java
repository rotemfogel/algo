package me.rotemfo;

public abstract class BinarySearch {

    private static int search(final int[] arr, int from, int len, final int what) {
        int low = from;
        int high = len - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            long value = arr[mid];

            if (value < what)
                low = mid + 1;
            else if (value > what)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -1;  // key not found.
    }

    public static int search(final int[] arr, final int what) {
        int len = arr.length - 1;
        if (what < arr[0] || what > arr[len]) return -1;
        return search(arr, 0, len, what);
    }
}
