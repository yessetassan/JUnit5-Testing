package com.project.JUnit5Testing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ClassInstanceOfTesting {

    StringBuilder stringBuilder = new StringBuilder();

    @AfterEach
    void tearDown() {
        System.out.println("Curernt state of sb : "  + stringBuilder);
    }

    @Test
    void name() {
        stringBuilder.append('A');
    }

    @Test
    void name2() {
        stringBuilder.append('B');
    }

    @Test
    void name3() {
        stringBuilder.append('C');
    }
}
