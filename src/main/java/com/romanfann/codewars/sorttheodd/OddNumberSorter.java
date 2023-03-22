package com.romanfann.codewars.sorttheodd;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toCollection;

public class OddNumberSorter {
    public int[] sortOdds(int[] numbers) {
        LinkedList<Integer> oddsSorted = getOddsSorted(numbers);
        return IntStream.rangeClosed(0, numbers.length - 1)
                .map(i -> isOdd(numbers[i]) ? oddsSorted.pop() : numbers[i])
                .toArray();
    }

    public LinkedList<Integer> getOddsSorted(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(this::isOdd)
                .sorted()
                .boxed()
                .collect(toCollection(LinkedList::new));
    }

    public boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
