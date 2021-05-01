package Java2.HomeWork6;

import com.sun.source.tree.IfTree;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Socket socket = null;
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            System.out.println("Сервер запущен, ожидаем подключения...");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            new Thread(() -> {
                try {
                    while(true) {
                        String input_str = in.readUTF();
                        if (input_str.equals("/end")) {
                            break;
                        }
                        out.writeUTF("Клиент: " + input_str);
                        System.out.println("Клиент: " + input_str);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }).start();
            new Thread(() -> {
                while(true) {
                    String output_str = null;
                    Scanner sc = new Scanner(System.in);
                    output_str = sc.nextLine();
                    if (output_str.equals("/end")) {
                        break;
                    }
                    try {
                        out.writeUTF("Сервер: " + output_str);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
