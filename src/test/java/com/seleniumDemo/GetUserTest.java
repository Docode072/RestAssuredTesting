package com.seleniumDemo;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetUserTest {

    @Test(enabled = false)
    public void getUser(){
         baseURI = "https://reqres.in/api";

         given()
                 .when()
                    .header("x-api-key", "reqres_a618b2964f614379b402a0c0ed495ca5")
                 .get("/users")
                 .then()
                 .statusCode(200)
                 .log().all();

    }
}
