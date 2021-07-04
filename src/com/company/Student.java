package com.company;

public class Student {
    public static void main(String[] args) {

        Userdefinedfunction s2=new Userdefinedfunction(); //s1 is object
        s2.setValues(1000,"shyam",30 ); //s1 calls setvalues
        System.out.println("id: "+s2.id);
        System.out.println("name: "+s2.name);
        System.out.println("age: "+s2.age);


    }
}
