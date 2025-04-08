package io;

import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ObjectSender {

    public static void main(String[] args) throws Exception {
        System.out.println("Sender Start");

        ServerSocketChannel ssChannel = ServerSocketChannel.open();
        ssChannel.configureBlocking(true); // Block until client connects

        int port = 7070;
        ssChannel.socket().bind(new InetSocketAddress(port));
        System.out.println("Listening on port " + port);

        while (true) {
            try (SocketChannel sChannel = ssChannel.accept()) {
                System.out.println("Client connected: " + sChannel.getRemoteAddress());

                ObjectOutputStream oos = new ObjectOutputStream(sChannel.socket().getOutputStream());
                oos.writeObject(new Person(100,"Kushal"));
                oos.flush();
                oos.close();

                System.out.println("Object sent. Connection ended.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
