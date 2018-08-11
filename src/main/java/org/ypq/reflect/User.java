package org.ypq.reflect;

public class User {

    private String name;
    private int age;
    private Room room;

    public void setUser(String name, Integer age, Room room) {
        this.name = name;
        this.age = age;
        if (room == null) {
            Room roomNew = new Room("default room number");
            this.room = roomNew;
        } else {
            this.room = (Room)room;
        }
    }

    public void printUser() {
        System.out.println("name=" + name + ",age=" + age + ",room=" + room.getRoomNumber());
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

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
