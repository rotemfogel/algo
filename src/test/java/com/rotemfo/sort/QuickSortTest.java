package com.rotemfo.sort;

import me.rotemfo.sort.QuickSort;
import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest extends SortTest {

    @Test
    public void sort() {
        final int[] sorted = QuickSort.sort(arr);
        Assert.assertEquals(sorted[0], 1);
        Assert.assertEquals(sorted[sorted.length - 1], 94);
    }
}
