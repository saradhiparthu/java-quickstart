package oop.inheritance;

import java.io.IOException;

public class Parent {
    public String test(){
        return "Hello";
    }
    public Number count(){
        return  Integer.valueOf(1);
    }
    public Object test123(){
        return new Object();
    }
    protected String test1(){
        return "it's protected";
    }
    void show() throws IOException { }
}
