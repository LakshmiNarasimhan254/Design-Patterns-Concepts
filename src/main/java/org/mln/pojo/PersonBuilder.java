package org.mln.pojo;

import java.util.function.Consumer;

public class PersonBuilder {
    public String id;
    public String firstName;
    public String lastName;
    public int age;

    public PersonBuilder builder(Consumer<PersonBuilder> personBuilderConsumer){
        personBuilderConsumer.accept(this);
        return this;
    }

    public Person build(){
        return new Person(id,firstName,lastName,age);
    }
}
