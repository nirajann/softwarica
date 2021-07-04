package com.company;
import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        Userdefinedfunction s1=new Userdefinedfunction(); //making an object of student class //object is instance of class
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter id : ");
        int no= sc.nextInt();

        s1.id=no;
        s1.name="nirajan";

        System.out.println("id: "+s1.id);
        System.out.println("name: "+s1.name);
        System.out.println("chala ja bsdk error");



    }
}
