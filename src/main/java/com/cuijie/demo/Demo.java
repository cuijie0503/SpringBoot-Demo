package com.cuijie.demo;

/**
 * 分支
 */
public class Demo {
    private  Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Demo(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Demo() {

        System.out.println("Demo init");
    }
}
