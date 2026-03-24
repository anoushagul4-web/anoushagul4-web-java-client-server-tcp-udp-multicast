import java.net.*;

public class UDPServer {

    public static void main(String[] args) throws Exception {

        DatagramSocket socket = new DatagramSocket(6000);

        byte[] buffer = new byte[1024];

        System.out.println("UDP Server started...");

        while (true) {

            DatagramPacket packet =
                    new DatagramPacket(buffer, buffer.length);

            socket.receive(packet);

            String request = new String(packet.getData(), 0, packet.getLength());

            String[] parts = request.split(" ");

            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            String op = parts[2];

            int result = 0;

            switch (op) {
                case "add":
                    result = a + b;
                    break;
                case "sub":
                    result = a - b;
                    break;
                case "mul":
                    result = a * b;
                    break;
                case "div":
                    result = a / b;
                    break;
            }

            String response = "Result = " + result;

            byte[] sendData = response.getBytes();

            DatagramPacket sendPacket =
                    new DatagramPacket(
                            sendData,
                            sendData.length,
                            packet.getAddress(),
                            packet.getPort());

            socket.send(sendPacket);
        }
    }
}