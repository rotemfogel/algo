package me.rotemfo;

public abstract class RecursiveBinarySearch {

    private static int search(int[] arr, int left, int right, int what) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            // If the element is present at the middle itself
            if (arr[mid] == what)
                return mid;

            // element is smaller than mid, present in left subarray
            if (arr[mid] > what)
                return search(arr, left, mid - 1, what);

            // element can only be present in right subarray
            return search(arr, mid + 1, right, what);
        }

        // element is not present
        return -1;
    }

    public static int search(final int[] arr, final int what) {
        int len = arr.length - 1;
        if (what < arr[0] || what > arr[len]) return -1;
        return search(arr, 0, len, what);
    }
}
