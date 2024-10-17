package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionPerformanceTest {
    private static final int TEST_SIZE = 1000;

    public static void main(String[] args) {
        testPerformance(new ArrayList<>(), "ArrayList");
        testPerformance(new LinkedList<>(), "LinkedList");
    }

    private static void testPerformance(List<Integer> list, String listType) {
        System.out.println("Testing performance of: " + listType);

        // Test add
        long addTime = testAdd(list);
        System.out.println("add: " + TEST_SIZE + " elements added in " + addTime + " ms");

        // Test get
        long getTime = testGet(list);
        System.out.println("get: " + TEST_SIZE + " elements accessed in " + getTime + " ms");

        // Test remove
        long removeTime = testRemove(list);
        System.out.println("remove: " + TEST_SIZE + " elements removed in " + removeTime + " ms");

        System.out.println();
    }

    public static long testAdd(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < TEST_SIZE; i++) {
            list.add(i);
        }
        return System.currentTimeMillis() - startTime;
    }

    public static long testGet(List<Integer> list) {
        // Ensure the list is populated
        for (int i = 0; i < TEST_SIZE; i++) {
            list.add(i);
        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < TEST_SIZE; i++) {
            list.get(i);
        }
        return System.currentTimeMillis() - startTime;
    }

    public static long testRemove(List<Integer> list) {
        // Ensure the list is populated
        for (int i = 0; i < TEST_SIZE; i++) {
            list.add(i);
        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < TEST_SIZE; i++) {
            list.remove(0); // Removing from the front
        }
        return System.currentTimeMillis() - startTime;
    }
}
