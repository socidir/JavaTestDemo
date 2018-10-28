package com.Demo.Test.Model;

/**
 * @author fengtao
 * @date 2018/10/28 14:48
 */
public class Dog {
    private int age;
    private String name;

    public Dog() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Run() {
        System.out.println(this.name + " is Run");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
