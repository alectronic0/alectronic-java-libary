package co.alectronic.test;

import co.alectronic.test.app.MyTestSpringApplication;
import com.jayway.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.containsString;

@ExtendWith(SpringExtension.class)
@SpringBootTest(
        classes = MyTestSpringApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        properties = {"server.port:0"})
class MyIntegrationTest {
    @Value("${local.server.port}")
    private int port;

    @BeforeEach
    void setup() {
        RestAssured.port = port;
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    @Test
    void testCall() {
        when().get("/call").
                then().statusCode(HttpStatus.OK.value()).body(containsString("Hello World!"));
    }
}
