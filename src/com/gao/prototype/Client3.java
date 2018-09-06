package com.gao.prototype;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Client3 {
    public static void main(String[] args) throws Exception {

        Date d = new Date(23333333333L);
        System.out.println(d);
        Sheep2 s1 = new Sheep2("ss",d);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(s1);
        byte[] s1Byte = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(s1Byte);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep2 s2= (Sheep2) ois.readObject();

        d.setTime(2233);


        System.out.println(s1);
        System.out.println(s2);
    }
}
