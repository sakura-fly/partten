package com.gao.prototype;

import java.io.Serializable;
import java.util.Date;

public class Sheep2 implements Cloneable,Serializable {// 这是多利2
    private String name;
    private Date birthday;

    public Sheep2() {
    }

    public Sheep2(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object o = super.clone();
        // 深复制 deep clone
        Sheep2 s = (Sheep2) o;
        s.birthday = (Date) this.birthday.clone();
        return o;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
