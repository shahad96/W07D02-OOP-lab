package com.company;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Shahad",25,1234,"java");
        Student student2 = new Student("nahed",27,1254,"javascript");
        Student student3 = new Student("lolo",22,1634,"kotlin");
        Teacher teacher1 = new Teacher("john",35,1274,"java");
        Teacher teacher2 = new Teacher("ali",29,1764,"javascript");
        Teacher teacher3 = new Teacher("jane",45,1974,"kotlin");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(teacher1.toString());
        System.out.println(teacher2.toString());
        System.out.println(teacher3.toString());

    }
}
