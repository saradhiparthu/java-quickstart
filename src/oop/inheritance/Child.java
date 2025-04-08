package oop.inheritance;

import java.io.FileNotFoundException;

public class Child extends Parent{
    @Override
    public String test() {
       String parent= super.test();
       String child ="Kuahl";
        return parent+child;
    }

    @Override
    public Integer count() {
      Number c=  super.count();
        return Integer.valueOf(c.intValue());
    }

    @Override
    public String test123() {
        Object o=  super.count();
        return String.valueOf(o.getClass());
    }
    @Override
    void show() throws RuntimeException  { }
}
