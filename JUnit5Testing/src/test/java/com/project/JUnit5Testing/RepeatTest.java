package com.project.JUnit5Testing;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@Order(3)
public class RepeatTest {

    Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("@BeforeEach is on...");
    }

    @DisplayName("Division")
    @RepeatedTest(value = 3, name = "{displayName}. Repetition {currentRepetition} of " +
             " {totalRepetition}")
    void name(RepetitionInfo repetitionInfo,
              TestInfo testInfo
    ) {
        // give
        int divisor = 1, dividable = 2,
                expected = 2;

        // when
        int res = calculator.division(dividable, divisor);

        // then
        assertEquals(expected, res,
                dividable + " / " + divisor + " should be : " + expected);
    }
}
