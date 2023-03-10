package za.co.sar.ckad.registration.boundary;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class RegistrationResourceTest {
    @Test
    public void testPingEndpoint() {
        given()
                .when().get("/v1/registration/ping")
                .then()
                .statusCode(200)
                .body(is("{\"Ping result\":\"OK\"}"));

    }
}
