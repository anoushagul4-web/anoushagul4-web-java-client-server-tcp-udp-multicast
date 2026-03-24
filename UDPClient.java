import java.net.*;
import java.io.*;

public class UDPClient {

    public static void main(String[] args) throws Exception {

        DatagramSocket socket = new DatagramSocket();

        BufferedReader userInput =
                new BufferedReader(new InputStreamReader(System.in));

        InetAddress ip = InetAddress.getByName("localhost");

        byte[] sendData;
        byte[] receiveData = new byte[1024];

        System.out.println("Enter: num1 num2 operation");

        while (true) {

            String message = userInput.readLine();

            sendData = message.getBytes();

            DatagramPacket sendPacket =
                    new DatagramPacket(sendData, sendData.length, ip, 6000);

            socket.send(sendPacket);

            DatagramPacket receivePacket =
                    new DatagramPacket(receiveData, receiveData.length);

            socket.receive(receivePacket);

            String response =
                    new String(receivePacket.getData(), 0, receivePacket.getLength());

            System.out.println("Server: " + response);
        }
    }
}