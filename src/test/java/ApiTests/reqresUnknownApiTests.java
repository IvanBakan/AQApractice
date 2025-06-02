package ApiTests;

import Pojo.GetUnknownApi;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class reqresUnknownApiTests {

    @Test
    public void getApiUnknow(){
        given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri("https://reqres.in/api")
                .basePath("/unknown")
                .header("x-api-key", "reqres-free-v1")
                .when().get()
                .then().log().body().statusCode(200);
    }


    @Test
    public void checkUserYear(){
        List<GetUnknownApi> users = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri("https://reqres.in/api")
                .basePath("/unknown")
                .when().get()
                .then().log().body().extract().jsonPath().getList("data", GetUnknownApi.class);

        for (GetUnknownApi user : users){
            Assertions.assertTrue(user.getYear() >= 2000);
        }
    }

    @Test
    public void checkUserName(){
        List<GetUnknownApi> users = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri("https://reqres.in/api")
                .basePath("/unknown")
                .when().get()
                .then().log().body().extract().jsonPath().getList("data", GetUnknownApi.class);

        for (GetUnknownApi user : users){
            Assertions.assertNotNull(user.getName());
        }
    }
}
