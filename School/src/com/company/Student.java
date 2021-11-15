package com.company;

public class Student {
    String name;
    int age;
    int id;
    String course;

    public Student(String name,int age,int id,String course){
        this.name = name;
        this.age =age;
        this.id=id;
        this.course =course;
    }
    public String toString(){
        return"the student name is: "+name+" age: "+age+" id: "+id+" course: "+course;
    }


}
