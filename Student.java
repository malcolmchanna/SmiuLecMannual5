package com.company;
import java.util.Scanner;

public class Student {

    public String name;
    public int age;
    public int marksofenglish;
    public int marksofmath;
    public int marksofscience;


    public int totalmarks(int eng, int math, int sci) {
        int obtained;
        obtained = eng + math + sci;
        return obtained;
    }

    public double percentage(int a){
        double total, percent;
        total = 300;
        percent = (a * 100) / total;
        return percent;
    }

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Student student = new Student();

            int a;
            double b;
        System.out.println("MUZAMIL JAMIL CHANNA");
            System.out.println("Enter student name");
            student.name = input.next();

        System.out.println("Enter student age");
            student.age = input.nextInt();
        System.out.println ("Enter marks of science");
            student.marksofscience=input.nextInt();
        System.out.println("Enter marks of math");
            student.marksofmath = input.nextInt();
        System.out.println("Enter marks of english");
            student.marksofenglish =input.nextInt();
            a= student.totalmarks(student.marksofenglish, student.marksofmath, student.marksofscience);
        System.out.println("\n Marks is: " + a );
            b = student.percentage(a);
        System.out.println("Percentage is: " + b);

        }
}