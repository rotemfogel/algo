package com.rotemfo.sort;

import me.rotemfo.sort.MergeSort;
import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest extends SortTest {
    @Test
    public void sort() {
        final int[] sorted = MergeSort.sort(arr);
        Assert.assertEquals(sorted[0], 1);
        Assert.assertEquals(sorted[5], 22);
        Assert.assertEquals(sorted[sorted.length - 1], 94);
    }

    @Test
    public void sortArrayOfSizeOne() {
        final int[] arr2 = {88};
        final int[] sorted = MergeSort.sort(arr2);
        Assert.assertArrayEquals(arr2, sorted);
    }

    @Test
    public void sortASortedArray() {
        final int[] arr2 = {1, 2, 3};
        final int[] sorted = MergeSort.sort(arr2);
        Assert.assertArrayEquals(arr2, sorted);
    }
}
