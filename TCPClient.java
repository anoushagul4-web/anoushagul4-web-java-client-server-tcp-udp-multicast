import java.io.*;
import java.net.*;

public class TCPClient {

    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("localhost", 5000);

        BufferedReader userInput =
                new BufferedReader(new InputStreamReader(System.in));

        BufferedReader input =
                new BufferedReader(new InputStreamReader(socket.getInputStream()));

        PrintWriter output =
                new PrintWriter(socket.getOutputStream(), true);

        String message;

        System.out.println("Enter: num1 num2 operation");

        while (true) {

            message = userInput.readLine();

            output.println(message);

            String response = input.readLine();

            System.out.println("Server: " + response);
        }
    }
}