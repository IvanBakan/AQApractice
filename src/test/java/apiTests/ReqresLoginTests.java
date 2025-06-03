package apiTests;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static builders.UserLoginGenerator.setSuccessfulUserData;
import static io.restassured.RestAssured.given;
import static builders.UserLoginGenerator.setUserData;

public class ReqresLoginTests {

    private static final String BASE_URI = "https://reqres.in/api";
    private static final String BASE_PATH = "/login";
    private static final String API_KEY_HEADER = "x-api-key";
    private static final String API_KEY_VALUE = "reqres-free-v1";


    @Test
    public void postLogin(){
        given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri(BASE_URI)
                .basePath(BASE_PATH)
                .header(API_KEY_HEADER, API_KEY_VALUE)
                .body(setUserData())
                .when().post()
                .then().log().body().statusCode(400);
    }

    @Test
    public void postSuccessfulLogin(){
        given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri(BASE_URI)
                .basePath(BASE_PATH)
                .header(API_KEY_HEADER, API_KEY_VALUE)
                .body(setSuccessfulUserData())
                .when().post()
                .then().log().body().statusCode(200);
    }
}
