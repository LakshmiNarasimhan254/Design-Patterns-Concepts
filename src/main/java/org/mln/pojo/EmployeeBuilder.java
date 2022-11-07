package org.mln.pojo;

public class EmployeeBuilder {

    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private boolean isContractor;



    //Setters
    public EmployeeBuilder setId(String id) {
        this.id = id;
        return this;
    }
    public EmployeeBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public EmployeeBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    public EmployeeBuilder setContractor(boolean contractor) {
        isContractor = contractor;
        return this;
    }


    public Employee build(){
        return new Employee(id,firstName,lastName,age,isContractor);
    }

    //For more readability
    public EmployeeBuilder and(){
        return this;
    }
    public EmployeeBuilder with(){
        return this;
    }

}
