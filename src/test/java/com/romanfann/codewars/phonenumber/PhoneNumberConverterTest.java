package com.romanfann.codewars.phonenumber;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.params.provider.Arguments.*;

class PhoneNumberConverterTest {
    PhoneNumberConverter phoneNumberConverter = new PhoneNumberConverter();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of(new int[] {1}),
                of(new int[] {1, 2}),
                of(new int[] {1, 2, 3}),
                of(new int[] {1, 2, 3, 4}),
                of(new int[] {1, 2, 3, 4, 5}),
                of(new int[] {1, 2, 3, 4, 5, 6}),
                of(new int[] {1, 2, 3, 4, 5, 6, 7}),
                of(new int[] {1, 2, 3, 4, 5, 6, 7, 8}),
                of(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}),
                of(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1})
        );
    }

    @Test
    void createPhoneNumber() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String expected = "(123) 456-7890";

        String result = phoneNumberConverter.createPhoneNumber(numbers);

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void wrongNumberLengthThrowsException(int[] numbers) {
        assertThrows(IllegalArgumentException.class, () -> {
            phoneNumberConverter.createPhoneNumber(numbers);
        });
    }
}