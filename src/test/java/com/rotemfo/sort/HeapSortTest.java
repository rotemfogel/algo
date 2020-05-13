package com.rotemfo.sort;

import me.rotemfo.sort.HeapSort;
import org.junit.Assert;
import org.junit.Test;

public class HeapSortTest extends SortTest {
    @Test
    public void sort() {
        final int[] sorted = HeapSort.sort(arr);
        Assert.assertEquals(sorted[0], 1);
        Assert.assertEquals(sorted[sorted.length - 1], 94);
    }
}
