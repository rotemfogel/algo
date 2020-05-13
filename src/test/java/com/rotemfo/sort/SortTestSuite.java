package com.rotemfo.sort;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        BubbleSortTest.class,
        QuickSortTest.class,
        MergeSortTest.class,
        HeapSortTest.class
})

public class SortTestSuite {
}
