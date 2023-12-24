package com.epam.mjc.collections.map;

import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        if(sourceList.isEmpty()){return false;}
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        for (Integer integer : sourceList) {
            System.out.println(integer * integer + 2);
            System.out.println(requiredValue + " f sdf");
            if (integer * 5 + 2 == requiredValue) {
                return true;
            }
        }

        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        return null;
    }
}
