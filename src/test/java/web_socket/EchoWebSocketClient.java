package web_socket;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class EchoWebSocketClient extends WebSocketClient {
    private final CountDownLatch latch;
    private final List<String> receivedMessages;
    private final List<String> messagesToSend;
    public EchoWebSocketClient(URI serverUri, CountDownLatch latch, List<String> receivedMessages, List<String> messagesToSend) {
        super(serverUri);
        this.latch = latch;
        this.receivedMessages = receivedMessages;
        this.messagesToSend = messagesToSend;
    }
    @Override
    public void onOpen(ServerHandshake handshake) {
        System.out.println("Connected to WebSocket server");
        // Отправка сообщений
        for (String msg : messagesToSend) {
            send(msg);
        }
    }
    @Override
    public void onMessage(String message) {
        System.out.println("Received: " + message);
        if (messagesToSend.contains(message)) {
            receivedMessages.add(message);
            latch.countDown();
        }
    }
    @Override
    public void onClose(int code, String reason, boolean remote) {
        System.out.println("Closed: " + reason);
    }
    @Override
    public void onError(Exception ex) {
        ex.printStackTrace();
    }
}
