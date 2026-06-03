import java.net.*;
import java.io.*;

public class TCPServer {

    public static void main(String[] args)
            throws Exception {

        ServerSocket server =
                new ServerSocket(5000);

        Socket socket =
                server.accept();

        System.out.println(
                "Client Connected"
        );

        server.close();

    }
}