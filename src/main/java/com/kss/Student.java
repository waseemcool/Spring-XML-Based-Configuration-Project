package com.kss;

public class Student {

    private int age;
    private int rollNo;

    //private Pen pen;
    private Writer writer;

    public Student(){
        //System.out.println("Student Created!...");
    }

    public Student(int age, int rollNo, Writer writer) {
        System.out.println("Constructor called!...");
        this.age = age;
        this.rollNo = rollNo;
        this.writer = writer;
    }

//    public int getAge() {
//        return age;
//    }

    public void setAge(int age) {
        //System.out.println("Setter called by Spring...");
        this.age = age;
    }

//    public int getRollNo() {
//        return rollNo;
//    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

//    public void setPen(Pen pen) {
//        this.pen = pen;
//    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

//    public void show(){
//        System.out.println("In show method");
//    }

    public void writeExam(){
        //pen.write();
        writer.write();
    }
}
