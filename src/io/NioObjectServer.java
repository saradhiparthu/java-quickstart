package io;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;

public class NioObjectServer {

    public static void main(String[] args) throws Exception {
        Selector selector = Selector.open();

        ServerSocketChannel server = ServerSocketChannel.open();
        server.configureBlocking(false);
        server.socket().bind(new InetSocketAddress(7070));
        server.register(selector, SelectionKey.OP_ACCEPT);

        System.out.println("Server listening on port 7070...");

        Person user = new Person(1, "Partha");
        ByteBuffer buffer = serializeToBuffer(user);

        while (true) {
            selector.select(); // Blocking until an event is ready

            Iterator<SelectionKey> keys = selector.selectedKeys().iterator();

            while (keys.hasNext()) {
                SelectionKey key = keys.next();
                keys.remove();

                if (key.isAcceptable()) {
                    SocketChannel client = server.accept();
                    client.configureBlocking(false);
                    client.register(selector, SelectionKey.OP_WRITE, buffer.duplicate()); // attach buffer per client
                    System.out.println("Accepted connection from " + client.getRemoteAddress());
                }

                if (key.isWritable()) {
                    SocketChannel client = (SocketChannel) key.channel();
                    ByteBuffer data = (ByteBuffer) key.attachment();
                    client.write(data);

                    if (!data.hasRemaining()) {
                        client.close(); // Close after sending
                        System.out.println("Sent object and closed connection.");
                    }
                }
            }
        }
    }

    // Convert object to ByteBuffer
    private static ByteBuffer serializeToBuffer(Object obj) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(obj);
        oos.flush();
        byte[] bytes = baos.toByteArray();
        return ByteBuffer.wrap(bytes);
    }
}
