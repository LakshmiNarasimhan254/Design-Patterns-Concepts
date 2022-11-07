package org.mln.pojo;

import lombok.Getter;

@Getter
public class Person {
    private String id;
    private String firstName;
    private String lastName;
    private int age;

    Person(String id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
