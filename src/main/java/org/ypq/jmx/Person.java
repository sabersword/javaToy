package org.ypq.jmx;

public class Person implements PersonMXBean {

    private String name;
    private int age;
    private Asset asset;

    public Person() {
    }

    public Person(String name, int age, Asset asset) {
        this.name = name;
        this.age = age;
        this.asset = asset;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Asset getAsset() {
        return asset;
    }

    @Override
    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    @Override
    public void print() {
        System.out.println(name + "   " + age);
    }
}
