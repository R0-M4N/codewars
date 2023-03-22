package com.romanfann.codewars.phonenumber;

import java.util.stream.IntStream;

public class PhoneNumberConverter {
    private static final int EXPECTED_LENGTH = 10;

    public String createPhoneNumber(int[] numbers) {
        numbersLengthCheck(numbers);
        String numbersString = String.join("", IntStream.of(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new));
        return numbersString.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
    }

    private void numbersLengthCheck(int[] numbers) {
        if (numbers.length != EXPECTED_LENGTH) {
            throw new IllegalArgumentException();
        }
    }
}
