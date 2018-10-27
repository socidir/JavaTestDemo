package com.Demo.Test.Model;

public class Person {
    private int age;
    private String name;
    // 身高
    private double height;
    // 体重
    private double weight;
    private String sex;

    public Person() {

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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", sex='" + sex + '\'' +
                '}';
    }
    //计算体重
    public String standardWeight()
    {
        // 体重 / （身高）^2
        String result = "";
        try {
            double h = this.height/100;
            double bmi = this.weight / (h*h);
            if(bmi>40){
                return "重度肥胖";
            }else if(bmi > 35){
                return "中度肥胖";
            }else if(bmi > 30){
                return "轻度肥胖";
            }else {
                return "...";
            }
        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return  result;

    }
}
