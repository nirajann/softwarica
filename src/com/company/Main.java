package com.company;
import java.util.Scanner;  // Import the Scanner class

public class Main {
    int id;
    String name;// instance variable
    int age;
    public static void main(String[] args) {
        Main s1=new Main(); //making an object of student class
        Scanner a= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter id : ");
        int id= a.nextInt();

        s1.id=id;
        s1.name="nirajan";

        System.out.println("id: "+s1.id);
        System.out.println("name: "+s1.name);
        System.out.println("chala ja bsdk error");



    }
}
