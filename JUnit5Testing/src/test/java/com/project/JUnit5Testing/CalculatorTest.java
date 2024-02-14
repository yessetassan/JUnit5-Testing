package com.project.JUnit5Testing;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@Order(2)
@DisplayName("Test Math Operations")
@TestMethodOrder(MethodOrderer.Random.class)
class CalculatorTest {
    
    Calculator calculator;

    @BeforeAll
    static void beforeAll() {
        System.out.println("@BeforeAll is on...");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("@AfterAll is on...");
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("@BeforeEach is on...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach is on...");
    }

    @ParameterizedTest
    @DisplayName("The integer division - [dividable, divisor, expected]")
//    @MethodSource
//    @CsvSource({
//            "5,2,2",
//            "5,0,0",
//            "10,2,5"
//
//    })
    @CsvFileSource(resources = "/integerDivision.csv")
    void testIntegerDivision(int dividable, int divisor, int expected) {

        if (divisor != 0) {
            // when
            int res = calculator.division(dividable, divisor);

            // then
            assertEquals(expected, res,
                    dividable + " / " + divisor + " should be : " + expected);
        } else {
            // then
            assertThrows(ArithmeticException.class, () -> calculator.division(dividable, divisor),
                    "You cannot divide by zero");
        }
    }

//    private static Stream<Arguments> testIntegerDivision() {
//
//        return Stream.of(
//                Arguments.of(5,2,2),
//                Arguments.of(5,0,0),
//                Arguments.of(6,2,3),
//                Arguments.of(10,5,2)
//                );
//    }

    @DisplayName("4 - 2 = 2")
    @Test
    @Disabled("Still Should Work on it...")
    void testIntegerSubtraction() {
        int res = calculator.division(4,2);
        assertEquals(2, res,"");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Assan", "Yesset", "Hi"})
    void valueSource(String name) {

        assertNotNull(name);
    }
}