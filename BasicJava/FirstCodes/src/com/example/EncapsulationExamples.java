package com.example;


class Student {

    private int age;
    private String name;
    private String city;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

public class EncapsulationExamples {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setAge(28);
        int age = s1.getAge();
        System.out.println(age);

        s1.setName("Rialdp");
        System.out.println(s1.getName());
    }
}
