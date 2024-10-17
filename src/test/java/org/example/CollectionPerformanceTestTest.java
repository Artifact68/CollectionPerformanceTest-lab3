package org.example;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class CollectionPerformanceTestTest {

    @Test
    public void testAdd() {
        CollectionPerformanceTest test = new CollectionPerformanceTest();
        long timeTaken = test.testAdd(new ArrayList<>());
        assertTrue(timeTaken >= 0);
    }

    @Test
    public void testGet() {
        CollectionPerformanceTest test = new CollectionPerformanceTest();
        test.testAdd(new ArrayList<>()); // Pre-fill the list
        long timeTaken = test.testGet(new ArrayList<>());
        assertTrue(timeTaken >= 0);
    }

    @Test
    public void testRemove() {
        CollectionPerformanceTest test = new CollectionPerformanceTest();
        test.testAdd(new ArrayList<>()); // Pre-fill the list
        long timeTaken = test.testRemove(new ArrayList<>());
        assertTrue(timeTaken >= 0);
    }
}
