package apiTests;

import pojo.GetUnknownApi;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ReqresUnknownApiTests {

    private static final String BASE_URI = "https://reqres.in/api";
    private static final String BASE_PATH = "/unknown";
    private static final String API_KEY_HEADER = "x-api-key";
    private static final String API_KEY_VALUE = "reqres-free-v1";

    @Test
    public void getApiUnknow(){
        given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri(BASE_URI)
                .basePath(BASE_PATH)
                .header(API_KEY_HEADER, API_KEY_VALUE)
                .when().get()
                .then().log().body().statusCode(200);
    }


    @Test
    public void checkUserYear(){
        List<GetUnknownApi> users = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri(BASE_URI)
                .basePath(BASE_PATH)
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
                .baseUri(BASE_URI)
                .basePath(BASE_PATH)
                .when().get()
                .then().log().body().extract().jsonPath().getList("data", GetUnknownApi.class);

        for (GetUnknownApi user : users){
            Assertions.assertNotNull(user.getName());
        }
    }
}
