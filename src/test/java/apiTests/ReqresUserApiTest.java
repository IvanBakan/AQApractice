package apiTests;

import pojo.GetUsersData;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ReqresUserApiTest {

    private static final String BASE_URI = "https://reqres.in/api";
    private static final String BASE_PATH = "/users?page=2";
    private static final String API_KEY_HEADER = "x-api-key";
    private static final String API_KEY_VALUE = "reqres-free-v1";

    @Test
    public void getUsersCode200(){
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
    public void checkDataSize(){
        List<GetUsersData> users = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri(BASE_URI)
                .basePath(BASE_PATH)
                .when().get()
                .then().log().body().extract().jsonPath().getList("data", GetUsersData.class);

        for (GetUsersData user : users){
            Assertions.assertEquals(6, users.size());
        }
    }
}
