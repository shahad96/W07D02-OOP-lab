package com.company;

public class Teacher {
    String name;
    int age;
    int id;
    String specialty;
    public Teacher(String name,int age,int id,String specialty){
        this.name = name;
        this.age =age;
        this.id=id;
        this.specialty =specialty;
    }
    public String toString(){
        return"the teacher name is: "+name+" age: "+age+" id: "+id+" specialty: "+specialty;
    }
}
