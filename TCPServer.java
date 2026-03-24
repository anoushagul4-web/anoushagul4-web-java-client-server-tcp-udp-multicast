import java.io.*;
import java.net.*;

class ClientHandler extends Thread {
    Socket socket;

    ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter output = new PrintWriter(
                    socket.getOutputStream(), true);

            String request;

            while ((request = input.readLine()) != null) {

                String[] parts = request.split(" ");

                if (parts.length != 3) {
                    output.println("Invalid format");
                    continue;
                }

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
                        if (b == 0) {
                            output.println("Division by zero");
                            continue;
                        }
                        result = a / b;
                        break;
                    default:
                        output.println("Unknown operation");
                        continue;
                }

                output.println("Result = " + result);
            }

            socket.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class TCPServer {
    public static void main(String[] args) throws Exception {

        ServerSocket server = new ServerSocket(5000);

        System.out.println("Server started...");

        while (true) {
            Socket socket = server.accept();
            System.out.println("Client connected");

            new ClientHandler(socket).start();
        }
    }
}