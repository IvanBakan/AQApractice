import Pojo.GetUnknownApi;
import Pojo.GetUsersData;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class reqresUserApiTest {

    @Test
    public void getUsersCode200(){
        given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri("https://reqres.in/api")
                .basePath("/users?page=2")
                .when().get()
                .then().log().body().statusCode(200);
    }

    @Test
    public void checkDataSize(){
        List<GetUsersData> users = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri("https://reqres.in/api")
                .basePath("/users?page=2")
                .when().get()
                .then().log().body().extract().jsonPath().getList("data", GetUsersData.class);

        for (GetUsersData user : users){
            Assertions.assertEquals(6, users.size());
        }
    }
}
