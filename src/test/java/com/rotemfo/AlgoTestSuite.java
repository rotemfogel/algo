package com.rotemfo;

import com.rotemfo.search.SearchTestSuite;
import com.rotemfo.sort.SortTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        SearchTestSuite.class,
        SortTestSuite.class
})

public class AlgoTestSuite {
}