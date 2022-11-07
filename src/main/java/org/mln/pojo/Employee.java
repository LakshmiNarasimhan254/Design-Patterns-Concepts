package org.mln.pojo;

public class Employee {

    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private boolean isContractor;

    protected Employee(String id, String firstName, String lastName, int age, boolean isContractor) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isContractor = isContractor;
    }

    //Getters
    public String getId(){return id;}
    public String getFirstName(){return firstName;}
    public String getLastName() {return lastName;}
    public int getAge() {return age;}
    public boolean isContractor(){return isContractor;}







}
