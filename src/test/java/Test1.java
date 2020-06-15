import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Test1 {

    @Test
    public void createUserResponse(){
        Response response= given().
                contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("{\"name\":\"pratiksha\",\"job\":\"student\"}")
 .when()
        .post("https://reqres.in/api/users");


        System.out.println("post Response\n"+response.asString());

    response.then().body("id", Matchers.any(String.class));
    response.then().body("name",Matchers.is("pratiksha"));
    assertEquals(response.getStatusCode(),201);



    }
}
