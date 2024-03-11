import java.util.*;
import java.io.*;
import java.net.*;

public class SocketClient {
    public static void main(String[] args) {
        String s;
        Scanner inputStream = null;
        PrintWriter outputStream = null;
        try {
            Socket clientSocket = new Socket("localhost", 6789);
            inputStream = new Scanner(new InputStreamReader(clientSocket.getInputStream()));
            outputStream = new PrintWriter(new DataOutputStream(clientSocket.getOutputStream()));
            
            Scanner keyboard = new Scanner(System.in);
            System.out.println("What is ur name?");
            String name = keyboard.nextLine();
            outputStream.println(name);
            outputStream.flush();
            s = inputStream.nextLine();
            System.out.println(s);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}