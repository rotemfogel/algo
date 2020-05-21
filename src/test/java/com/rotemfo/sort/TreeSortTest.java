package com.rotemfo.sort;

import me.rotemfo.sort.TreeSort;
import org.junit.Assert;
import org.junit.Test;

public class TreeSortTest extends SortTest {
    @Test
    public void sort() {
        final int[] sorted = TreeSort.sort(arr);
        Assert.assertEquals(sorted[0], 1);
        Assert.assertEquals(sorted[5], 22);
        Assert.assertEquals(sorted[sorted.length - 1], 94);
    }

}
