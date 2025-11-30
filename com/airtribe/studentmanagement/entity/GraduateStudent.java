package com.airtribe.studentmanagement.entity;

public class GraduateStudent extends Student {
    
    private String title;
    private String researchTopics;

    public GraduateStudent(String name, int age, String gender, String phoneNo, String email, String studentId,
            String studentProgram, double studentGPA, String title, String researchTopics) {
        super(name, age, gender, phoneNo, email, studentId, studentProgram, studentGPA);
        this.title = title;
        this.researchTopics = researchTopics;
    }

    public void displayGraduateStudentDetails(){
        super.displayStudentDetails();
        System.out.println("Title: "+ title);
        System.out.println("Research topic: "+ researchTopics);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getResearchTopics() {
        return researchTopics;
    }

    public void setResearchTopics(String researchTopics) {
        this.researchTopics = researchTopics;
    }

    
}
