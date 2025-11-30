package com.airtribe.studentmanagement.entity;

public abstract class Person {
    private String name;
    private int age;
    private String gender;
    private String phoneNo;
    private String email;

    public Person(String name, int age, String gender, String phoneNo, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public void displayPerson(){
        System.out.println("Student Name:"+ name);
        System.out.println("Student Age:"+ age);
        System.out.println("Student Gender:"+ gender);
        System.out.println("Student Phone Number:"+ phoneNo);
        System.out.println("Student Email Address:"+ email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }    
}
