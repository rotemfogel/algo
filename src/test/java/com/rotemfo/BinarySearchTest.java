package com.rotemfo;

import me.rotemfo.BinarySearch;
import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {
    private final int[] arr = {0, 1, 21, 33, 42, 46, 52, 57, 60, 66, 78, 89, 91, 96};

    @Test
    public void search() {
        Assert.assertEquals(BinarySearch.search(arr, 43), -1);
        Assert.assertEquals(BinarySearch.search(arr, 42), 4);
        Assert.assertEquals(BinarySearch.search(arr, 99), -1);
    }
}
