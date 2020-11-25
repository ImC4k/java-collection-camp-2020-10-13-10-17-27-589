package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;
import java.util.Map;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        Double accumlated = arrayList.stream()
                .mapToDouble(number -> number)
                .reduce(0, Double::sum);
        return accumlated/arrayList.size();
    }

    public int getMaxValue() {
        return arrayList.stream()
                .reduce(0, Integer::max);
    }

    public int getLastOdd() {
        return arrayList.stream()
                .reduce(0, (lastOdd, number) -> number % 2 == 1? number : lastOdd);
    }
}
