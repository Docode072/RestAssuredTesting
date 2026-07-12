package com.seleniumDemo;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CreateUserTest {


    @Test(enabled = true)
    public void createUserTest(){
        baseURI = "https://reqres.in/api";
        File jsonFile = new File("src/test/resources/createUser.json");
       given()
                .header("x-api-key", "reqres_a618b2964f614379b402a0c0ed495ca5")
                .header("Content-Type", "application/json")   // important!
                .body(jsonFile) // valid JSON
        .when()
                .post("users")
        .then()
                .statusCode(201)
                .log().all();
              // .body("page", equalTo(1))
              // .body("data[0].first_name",  equalTo("George"))
             //  .body("support.url", containsString("contentcaddy.io"));

    }
}
