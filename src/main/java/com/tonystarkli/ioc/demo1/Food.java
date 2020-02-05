package com.tonystarkli.ioc.demo1;

public class Food {

    private String name;
    private String taste;
    private String kind;

    public void setName(String name) {
        this.name = name;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", taste='" + taste + '\'' +
                ", kind='" + kind + '\'' +
                '}';
    }
}
