package com.gao.composite.killsoftware;

public class TextFile implements AbstractFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void kill() {
        System.out.println("img " + name + " kill");

    }
}
