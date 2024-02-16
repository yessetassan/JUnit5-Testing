package com.project.JUnit5Testing.self_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserImplTest {

    UserImpl userImpl;
    String name;
    String email;
    String expectedMessage;
    int age;

    @BeforeEach
    void setUp() {
        name = "Assan";
        email = "assan@gmail.com";
        age = 20;
        userImpl = new UserImpl();
    }

    @Test
    void testCreateUser_whenOneOfElementIsMissing_thenReturnException() {
        // given
        name = "";
        expectedMessage = "User's name should be not empty !!!";

        // when
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
            userImpl.createUser(name,age,email);
        }, "NameUserException IS NOT HANDLED !!!");

        // then
        assertEquals(expectedMessage, illegalArgumentException.getMessage(),
                "NameUserException is wrong !!!");

    }

    @Test
    void testCreateUser_whenOneOfElementIsMissing_thenReturnException2() {
        // given
        email = "";
        expectedMessage = "User's email should be not empty !!!";

        // when
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
            userImpl.createUser(name,age,email);
        }, "EmailUserException IS NOT HANDLED !!!");

        // then
        assertEquals(expectedMessage, illegalArgumentException.getMessage(),
                "EmailUserException is wrong !!!");

    }

    @Test
    void testCreateUser_whenOneOfElementIsMissing_thenReturnException3() {
        // given
        age = 15;
        expectedMessage = "User's age should be greater than 15 !!!";

        // when
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
            userImpl.createUser(name,age,email);
        }, "AgeUserException IS NOT HANDLED !!!");

        // then
        assertEquals(expectedMessage, illegalArgumentException.getMessage(),
                "AgeUserException is wrong !!!");

    }
}