package com.romanfann.codewars.descendingorder;

import java.util.Arrays;
import java.util.stream.Collectors;

import static java.util.Collections.reverseOrder;
import static java.util.stream.Collectors.joining;

public class DigitSorter {
    public int sortDesc(int number) {
        String[] digits = String.valueOf(number).split("");
        return Arrays.stream(digits)
                .sorted(reverseOrder())
                .collect(Collectors.collectingAndThen(joining(), Integer::parseInt));
    }
}
