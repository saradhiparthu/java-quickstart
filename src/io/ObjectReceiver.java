package io;

import java.io.ObjectInputStream;
import java.net.Socket;

public class ObjectReceiver {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 7070);

        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        Person person = (Person) ois.readObject();

        System.out.println("Received: " + person.name);

        ois.close();
        socket.close();
    }
}
