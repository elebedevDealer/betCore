package tests;

import Api.ApiUtils;
import base.BaseTest;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import web_socket.EchoWebSocketClient;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;

public class UserApiTest extends BaseTest {
    @Test
    public void getUserList(){
        ValidatableResponse response = ApiUtils.getRequest("/users?page=2")
                .statusCode(200)
                // 1 пункт, проверки в body
                .body("data.first_name[0]", Matchers.notNullValue())
                .body("data.email[0]", Matchers.notNullValue())
                .body("data.last_name[0]", Matchers.notNullValue())
                .body("data.avatar[0]", Matchers.notNullValue())
                .body("data.id[0]", Matchers.notNullValue())
                // 3 пункт, другие проверки.
                .body("page", Matchers.equalTo(2))
                .body("data", Matchers.hasSize(6))
                .body("data.last_name", Matchers.hasItem("Edwards"));
        String firstName = response.extract().jsonPath().getString("data.first_name[0]");
        System.out.println(firstName);

        List<String> avatars = response.extract().jsonPath().getList("data.avatar");
        System.out.println(avatars);
        String firstName1 = response.extract().jsonPath().getString("data.first_name[1]");
        System.out.println(firstName1);
        String lastName1 = response.extract().jsonPath().getString("data.last_name[1]");
        System.out.println(lastName1);
        String id1 = response.extract().jsonPath().getString("data.id[1]");
        System.out.println(id1);
        String email1 = response.extract().jsonPath().getString("data.email[1]");
        System.out.println(email1);
        String avatar1 = response.extract().jsonPath().getString("data.avatar[1]");
        System.out.println(avatar1);

// 2 пункт, проверки в assertThat
        assertThat("некорректное значение", avatars, Matchers.allOf(Matchers.notNullValue()));
        assertThat("некорректное значение", firstName1, Matchers.is(Matchers.not(Matchers.emptyOrNullString())));
        assertThat("некорректное значение", avatar1, Matchers.is(Matchers.not(Matchers.emptyOrNullString())));
        assertThat("некорректное значение", lastName1, Matchers.is(Matchers.not(Matchers.emptyOrNullString())));
        assertThat("некорректное значение", id1, Matchers.is(Matchers.not(Matchers.emptyOrNullString())));
        assertThat("некорректное значение", email1, Matchers.is(Matchers.not(Matchers.emptyOrNullString())));



    }

   // @Test
    public void createUser(){
        String name = "Ivan";
        String job = "QA";
        ValidatableResponse response = ApiUtils.postRequest("/users", name, job)
                .statusCode(201)
                .body("name", Matchers.equalTo(name));
    }

   // @Test
    public void testWebSocket() throws URISyntaxException, InterruptedException {
        URI uri = new URI("wss://echo.websocket.org");
        List<String> messagesToSend = Arrays.asList("Message 1", "Message 2","Message 3");
        List<String> receivedMessages = new ArrayList<>();
        CountDownLatch latch = new CountDownLatch(messagesToSend.size());

        EchoWebSocketClient client = new EchoWebSocketClient(uri, latch, receivedMessages, messagesToSend);
        client.connectBlocking();
        boolean allMessagesReceived = latch.await(5, TimeUnit.SECONDS);
        client.close();

        assertThat("все сообщения должны быть получены", allMessagesReceived, Matchers.is(true));
        assertThat("пришло 3 сообщения всего", receivedMessages, Matchers.hasSize(3));
        assertThat("все сообщения соответствуют отправленным", receivedMessages, Matchers.containsInAnyOrder("Message 1", "Message 2","Message 3"));
    }
}
