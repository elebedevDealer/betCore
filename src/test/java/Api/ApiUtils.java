package Api;

import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class ApiUtils {
    public static ValidatableResponse getRequest(String endpoint){
        return given()
                .header("x-api-key", "free_user_3HUncsRoQ6id2yoIJrIF6Re1eaN")
                .when()
                .get(endpoint)
                .then()
                .log()
                .all();
    }
    public static ValidatableResponse postRequest(String endpoint, String name, String job){
        String body = "{\n" +
                "    \"name\": \"" + name + "\",\n" +
                "    \"job\": \"" + job + "\"\n" +
                "}";
        return given()
                .header("Content-Type","application/json")
                .header("x-api-key", "free_user_3HUncsRoQ6id2yoIJrIF6Re1eaN")
                .body(body)
                .when()
                .log()
                .all()
                .post(endpoint)
                .then()
                .log()
                .all();
    }
}
