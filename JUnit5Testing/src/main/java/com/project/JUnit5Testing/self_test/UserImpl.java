package com.project.JUnit5Testing.self_test;

public class UserImpl implements UInterface{
    @Override
    public User createUser(String name, int age, String email) throws IllegalArgumentException {

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("User's name should be not empty !!!");
        }
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("User's email should be not empty !!!");
        }
        if (age < 16) {
            throw new IllegalArgumentException("User's age should be greater than 15 !!!");
        }
        return new User(name,age,email);
    }
}
