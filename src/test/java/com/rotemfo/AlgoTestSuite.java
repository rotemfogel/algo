package com.rotemfo;

import com.rotemfo.search.BinarySearchTest;
import com.rotemfo.search.RecursiveBinarySearchTest;
import com.rotemfo.sort.BubbleSortTest;
import com.rotemfo.sort.QuickSortTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        BinarySearchTest.class,
        RecursiveBinarySearchTest.class,
        BubbleSortTest.class,
        QuickSortTest.class
})

public class AlgoTestSuite {
}
