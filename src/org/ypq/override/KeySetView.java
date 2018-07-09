package org.ypq.override;

public class KeySetView extends KeySet {

    private int salary;

    public KeySetView(int age, int salary) {
        this.age = age;
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println("我是子类");
    }
}
