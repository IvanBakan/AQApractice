import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static Builders.UserLoginGenerator.setSuccessfulUserData;
import static io.restassured.RestAssured.given;
import static Builders.UserLoginGenerator.setUserData;

public class reqresLoginTests {


    @Test
    public void postLogin(){
        given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri("https://reqres.in/api")
                .basePath("/login")
                .header("x-api-key", "reqres-free-v1")
                .body(setUserData())
                .when().post()
                .then().log().body().statusCode(400);
    }

    @Test
    public void postSuccessfulLogin(){
        given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri("https://reqres.in/api")
                .basePath("/login")
                .header("x-api-key", "reqres-free-v1")
                .body(setSuccessfulUserData())
                .when().post()
                .then().log().body().statusCode(200);
    }
}
