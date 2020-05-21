package com.rotemfo.sort;

import me.rotemfo.sort.BubbleSort;
import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest extends SortTest {
    @Test
    public void sort() {
        final int[] sorted = BubbleSort.sort(arr);
        Assert.assertEquals(sorted[0], 1);
        Assert.assertEquals(sorted[5], 22);
        Assert.assertEquals(sorted[sorted.length - 1], 94);
    }
}
