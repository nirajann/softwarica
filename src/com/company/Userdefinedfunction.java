package com.company;

public class Userdefinedfunction {
    int id;
    String name;// instance variable //they have defulvalue
    int age;
    //method publc <return type> <method_name> (parameter){}

    public void setValues(int i, String n, int a){
        id=i;
        name=n;
        age=a;

    }

    //constructor is also a method with no return type
    public Userdefinedfunction(int id, String name,int age){
        id=id;
        name=name;
        age=age;

    }





}
