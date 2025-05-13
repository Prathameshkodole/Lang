
import java.io.*;
import java.net.*;

public class TCPCilentServer {

    // Server program
    public static class TCPServer {
        public static void main(String[] args) {
            final int PORT = 12345; // Port number for the server

            try (ServerSocket serverSocket = new ServerSocket(PORT)) {
                System.out.println("Server started. Listening on port " + PORT);

                while (true) {
                    try (Socket clientSocket = serverSocket.accept(); // Accept incoming client connection
                         BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                         PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

                        System.out.println("Client connected from: " + clientSocket.getInetAddress());

                        // Read message from the client
                        String message = in.readLine();
                        System.out.println("Received from client: " + message);

                        // Send a response back to the client
                        String response = "Server received: " + message;
                        out.println(response);

                        System.out.println("Sent to client: " + response);
                    } catch (IOException e) {
                        System.err.println("Exception in server: " + e.getMessage());
                    }
                    // The client socket and streams are automatically closed due to try-with-resources
                }
                // The server socket is automatically closed due to try-with-resources
            } catch (IOException e) {
                System.err.println("Error starting server: " + e.getMessage());
            }
            System.out.println("Server stopped."); //This line will never be executed as the server runs in an infinite loop.
        }
    }





    // Client program
    public static class TCPClient {
        public static void main(String[] args) {
            final String SERVER_ADDRESS = "localhost"; // Or the actual server IP address
            final int PORT = 12345;

            try (Socket socket = new Socket(SERVER_ADDRESS, PORT); // Connect to the server
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                 BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))) {

                System.out.println("Connected to server: " + SERVER_ADDRESS + " on port " + PORT);

                String userInput;
                System.out.println("Type your message (or type 'exit' to close connection):");
                while ((userInput = stdIn.readLine()) != null) {
                    out.println(userInput); // Send message to the server
                    System.out.println("Sent to server: " + userInput);

                    if ("exit".equalsIgnoreCase(userInput)) {
                        break; // Exit the loop if user enters "exit"
                    }

                    String serverResponse = in.readLine(); // Read response from the server
                    System.out.println("Received from server: " + serverResponse);
                    System.out.println("Type your message (or type 'exit' to close connection):");
                }
                System.out.println("Closing connection.");

            } catch (IOException e) {
                System.err.println("Exception in client: " + e.getMessage());
            }
            System.out.println("Client stopped.");
        }
    }
}


