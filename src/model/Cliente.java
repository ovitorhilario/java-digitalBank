package model;

public class Cliente {
    private String name;
    private int age;

    public Cliente(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return "Name: " + this.name + "\n" +
                "Age: " + this.age;
    }
}
