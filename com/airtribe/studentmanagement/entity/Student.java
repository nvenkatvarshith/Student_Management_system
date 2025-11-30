package com.airtribe.studentmanagement.entity;

public class Student extends Person{
    private String studentId;
    private String studentProgram;
    private double studentGPA;

    public Student(String name,int age,String gender,String phoneNo,String email,String studentId,String studentProgram, double studentGPA){
        super(name,age,gender,phoneNo,email);
        this.studentId = studentId;
        this.studentProgram = studentProgram;
        this.studentGPA = studentGPA;
    }

    public void displayStudentDetails(){
        super.displayPerson();
        System.out.println("Student ID: "+ studentId);
        System.out.println("Student Program: "+ studentProgram);
        System.out.println("Student GPA: "+ studentGPA);
    }

    public void displayMinimalStudentDetails(){
        System.out.println("Student ID: "+ studentId);
        System.out.println("Student Name: "+ super.getName());
        System.out.println("Student GPA: "+ studentGPA);
        System.out.println("Student Email: " + super.getEmail());
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentProgram() {
        return studentProgram;
    }

    public void setStudentProgram(String studentProgram) {
        this.studentProgram = studentProgram;
    }

    public double getStudentGPA() {
        return studentGPA;
    }

    public void setStudentGPA(double studentGPA) {
        this.studentGPA = studentGPA;
    }
}
