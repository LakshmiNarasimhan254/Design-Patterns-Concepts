package org.mln;

import com.github.javafaker.Faker;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import org.mln.pojo.*;
import org.testng.annotations.Test;

public class BuilderPatternTest {

    @Test
    public void postJsonUsingExternalClassBuilderTest() {
        Employee employee = new EmployeeBuilder().with()
                .setId(getRandomId())
                .and()
                .setFirstName("Lakshmi")
                .and()
                .setLastName("Mohan")
                .and()
                .setAge(34)
                .build();
     Response response= given()
                         .baseUri("http://localhost:3000/")
                         .contentType(ContentType.JSON)
                         .body(employee)
                         .post("/employees");
        Assertions
                .assertThat(
                        response.getStatusCode())
                        .isEqualTo(201);

    }

    @Test
    public void postJsonUsingStaticInnerClassBuilderTest(){
        Student student = Student.builder()
                .setId(getRandomId())
                .and()
                .setFirstName("Srinath")
                .and()
                .setLastName("Mohan")
                .and()
                .setAge(34)
                .build();
        Response response= given()
                .log()
                .all()
                .baseUri("http://localhost:3000/")
                .contentType(ContentType.JSON)
                .body(student)
                .post("/students");
        Assertions
                .assertThat(
                        response.getStatusCode())
                .isEqualTo(201);

    }

    @Test
    public void postJsonUsingLombokTest(){
       Player player = Player.builder().setId(getRandomId()).setName("Yuvraj").setCountry("India").setSport("Cricket").setIsCaptain(false).build();
       Response response= given()
                .log()
                .all()
                .baseUri("http://localhost:3000/")
                .contentType(ContentType.JSON)
                .body(player)
                .post("/players");
        Assertions
                .assertThat(
                        response.getStatusCode())
                .isEqualTo(201);

    }
    @Test
    public void postJsonUsingConsumerLamdaTest(){
    Person person=new PersonBuilder().builder(personBuilder -> {
            personBuilder.id=getRandomId();
            personBuilder.age=34;
            personBuilder.firstName="Srinath";
            personBuilder.lastName="Mohan";
        }).build();
        Response response= given()
                .log()
                .all()
                .baseUri("http://localhost:3000/")
                .contentType(ContentType.JSON)
                .body(person)
                .post("/persons");
        Assertions
                .assertThat(
                        response.getStatusCode())
                .isEqualTo(201);

    }

    private String getRandomId() {
        return Faker.instance().idNumber().valid();
    }
}
