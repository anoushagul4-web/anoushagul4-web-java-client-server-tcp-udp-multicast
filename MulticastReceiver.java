import java.net.*;
import java.io.*;

public class MulticastReceiver {
    public static void main(String[] args) throws Exception {

        int port = 4446;

        MulticastSocket socket = new MulticastSocket(port);

        InetAddress group = InetAddress.getByName("230.0.0.0");

        socket.joinGroup(group);

        byte[] buffer = new byte[1024];

        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        System.out.println("Waiting for multicast message...");

        socket.receive(packet);

        String message = new String(packet.getData(), 0, packet.getLength());

        System.out.println("Received: " + message);

        socket.leaveGroup(group);

        socket.close();
    }
}