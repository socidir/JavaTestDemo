package com.Demo.Test;

import com.Demo.Test.Model.Dog;
import com.Demo.Test.Model.Person;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        System.out.println(add(1,2));
        Person p = new Person();
        p.setAge(20);
        p.setHeight(175);
        p.setWeight(180);
        System.out.println(p.toString());
        System.out.println(p.standardWeight());
        Dog d = new Dog();
        d.Run();
    }
    public static int add(int x,int y)
    {
        return x+y;
    }
}
