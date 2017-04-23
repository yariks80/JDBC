package com.company;

/**
 * Created by DELL on 4/23/2017.
 */


public class Employee  implements Comparable<Employee>  {
    int id;
    String name;
    String city;
    int age;
    double comm;

    public Employee(int id, String name, String city, int age, double comm) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
        this.comm = comm;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", comm=" + comm +
                "}\n";
    }

    @Override
    public int compareTo(Employee o) {
        return age-o.age;
    }
}
