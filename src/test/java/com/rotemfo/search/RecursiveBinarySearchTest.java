package com.rotemfo.search;

import me.rotemfo.search.BinarySearch;
import org.junit.Assert;
import org.junit.Test;

public class RecursiveBinarySearchTest extends SearchTest {

    @Test
    public void search() {
        Assert.assertEquals(BinarySearch.search(arr, 43), -1);
        Assert.assertEquals(BinarySearch.search(arr, 42), 4);
        Assert.assertEquals(BinarySearch.search(arr, 99), -1);
    }
}
