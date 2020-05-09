package me.rotemfo.sort;

class Sorter {
    protected static void swap(final int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
