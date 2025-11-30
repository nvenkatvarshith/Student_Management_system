package com.airtribe.studentmanagement.entity;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int courseId;
    private String courseName;
    private String[] courseTechnologies;
    private int courseFee;
    private List<Student> students;

    public Course(int courseId, String courseName, String[] courseTechnologies, int courseFee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseTechnologies = courseTechnologies;
        this.courseFee = courseFee;
        students = new ArrayList<>();
    }
    
    public void displayCourseDetails(){
        System.out.println("Course ID: "+courseId);
        System.out.println("Course Name: "+courseName);
        System.out.println("Course Technologies: ");
        for(int i=0;i<courseTechnologies.length;i++){
            System.out.println(courseTechnologies[i]);
        }
        System.out.println("Course Fee: "+courseFee);
        System.out.println("Students in this course");
        for(Student s:students){
            s.displayMinimalStudentDetails();
        }
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String[] getCourseTechnologies() {
        return courseTechnologies;
    }

    public void setCourseTechnologies(String[] courseTechnologies) {
        this.courseTechnologies = courseTechnologies;
    }

    public int getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(int courseFee) {
        this.courseFee = courseFee;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
