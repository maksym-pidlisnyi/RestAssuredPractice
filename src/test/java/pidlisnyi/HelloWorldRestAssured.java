package pidlisnyi;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

@Slf4j
public class HelloWorldRestAssured {

    @Test
    public void makeSureThatGoogleIsUp() {
        given().when().get("http://www.google.com").then().statusCode(200);
    }
}
