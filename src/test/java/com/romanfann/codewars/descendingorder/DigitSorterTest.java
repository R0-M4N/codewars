package com.romanfann.codewars.descendingorder;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitSorterTest {
    DigitSorter digitSorter = new DigitSorter();

    @ParameterizedTest
    @CsvFileSource(resources = "/descendingorder/numbers.csv", numLinesToSkip = 1)
    void sortDesc(int expected, int number) {
        int result = digitSorter.sortDesc(number);

        assertEquals(expected, result);
    }
}