package com.project.JUnit5Testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations")
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

    @Test
    @DisplayName("4 / 2 = 2")
    void testIntegerDivision() {
        // given
        int dividable = 4,
                divisor = 2,
                expected = 2;

        // when
        int res = calculator.division(dividable, divisor);

        // then
        assertEquals(expected, res,
                dividable + " / " + divisor + " should be : " + expected );
    }

    @DisplayName("4 - 2 = 2")
    @Test
    @Disabled("Still Should Work on it...")
    void testIntegerSubtraction() {
        int res = calculator.division(4,2);
        assertEquals(2, res,"");
    }
}