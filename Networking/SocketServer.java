import java.util.*;
import java.io.*;
import java.net.*;


public class SocketServer {
    public static void main(String[] args) {
        String s;
        Scanner inputStream = null;
        PrintWriter outputStream = null;
        ServerSocket serverSocket = null;
        try {
            System.out.println("Waiting for a client...");
            serverSocket = new ServerSocket(6789);
            Socket socket = serverSocket.accept();
            inputStream = new Scanner(new InputStreamReader(socket.getInputStream()));
            outputStream = new PrintWriter(new DataOutputStream(socket.getOutputStream()));
            s = inputStream.nextLine();
            System.out.println(s + " has connected!");

            inputStream.close();
            outputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}