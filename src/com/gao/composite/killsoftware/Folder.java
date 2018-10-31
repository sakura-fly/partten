package com.gao.composite.killsoftware;

import java.util.ArrayList;
import java.util.List;

public class Folder implements AbstractFile {
    private String name;

    // 定义容器，存放荣旗下的节点
    private List<AbstractFile> list = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void kill() {
        System.out.println("img " + name + " kill");
        for (AbstractFile abstractFile : list){
            abstractFile.kill();
        }
    }


    public void add(AbstractFile file) {
        list.add(file);
    }

    public void remove(AbstractFile file) {
        list.remove(file);
    }

    public AbstractFile get(int index) {
        return list.get(index);
    }


}
