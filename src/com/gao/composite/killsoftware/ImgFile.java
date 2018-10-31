package com.gao.composite.killsoftware;

public class ImgFile implements AbstractFile {
    private String name;

    public ImgFile(String name) {
        this.name = name;
    }

    @Override
    public void kill() {
        System.out.println("img " + name + " kill");
    }
}
