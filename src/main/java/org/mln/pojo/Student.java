package org.mln.pojo;

public class Student {

    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private boolean isDayScholar;

    private Student(String id, String firstName, String lastName, int age, boolean isDayScholar) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
        this.isDayScholar = isDayScholar;
    }

    //getter methods for serialising
    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isDayScholar() {
        return isDayScholar;
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public static class StudentBuilder {

        private String id;
        private String firstName;
        private String lastName;
        private int age;
        private boolean isDayScholar;

        public StudentBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public StudentBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public StudentBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setDayScholar(boolean dayScholar) {
            isDayScholar = dayScholar;
            return this;
        }

        public Student build() {
            return new Student(id, firstName, lastName, age, isDayScholar);
        }

        //For more readability
        public StudentBuilder and() {
            return this;
        }

        public StudentBuilder with() {
            return this;
        }


    }


}
