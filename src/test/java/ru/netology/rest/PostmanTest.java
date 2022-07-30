package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
public class PostmanTest {
    @Test
void should1 () {
        given()
                .baseUri("https://postman-echo.com")
                .body("Postman ")
                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("Postman "))
                .body("data", notNullValue())
                ;
    }
}
