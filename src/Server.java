import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);//65535
        System.out.println("Server started on port on 8000");

        while(true){
           Socket socket =  serverSocket.accept();
            System.out.println("client connected "+ socket.getInetAddress().getAddress());
        }

    }
}