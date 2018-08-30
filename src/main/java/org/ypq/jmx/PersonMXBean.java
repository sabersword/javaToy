package org.ypq.jmx;

public interface PersonMXBean {

    public String getName();

    public void setName(String name);

    public int getAge();

    public void setAge(int age);

    public void print();

    public Asset getAsset();

    public void setAsset(Asset asset);

}
