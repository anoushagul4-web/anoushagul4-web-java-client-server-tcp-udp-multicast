import java.net.*;
import java.io.*;

public class MulticastSender {
    public static void main(String[] args) throws Exception {

        InetAddress group = InetAddress.getByName("230.0.0.0");
        int port = 4446;

        DatagramSocket socket = new DatagramSocket();

        String message = "Hello from Multicast Sender";

        byte[] buffer = message.getBytes();

        DatagramPacket packet =
                new DatagramPacket(buffer, buffer.length, group, port);

        socket.send(packet);

        System.out.println("Message sent to multicast group.");

        socket.close();
    }
}