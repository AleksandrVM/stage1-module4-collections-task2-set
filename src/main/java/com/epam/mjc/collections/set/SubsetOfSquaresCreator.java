package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> treeSet = new TreeSet<>();
        for (Integer integer : sourceList){
            treeSet.add(integer * integer);
        }
        return treeSet.subSet(lowerBound, true, upperBound, true);
    }
}
