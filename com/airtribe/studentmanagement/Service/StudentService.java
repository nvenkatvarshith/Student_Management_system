package com.airtribe.studentmanagement.Service;

import java.util.ArrayList;
import java.util.List;

import com.airtribe.studentmanagement.entity.Student;

public class StudentService {
    private static List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudentById(String id) {
        for(Student s : students){
            if(s.getStudentId().equals(id)){
                return s;
            }
        }
        return null;
    }

    public void updateStudent(Student student) {
        Student s = getStudentById(student.getStudentId());
        s.setAge(student.getAge());
        s.setEmail(student.getEmail());
        s.setGender(student.getGender());
        s.setName(student.getName());
        s.setPhoneNo(student.getPhoneNo());
        s.setStudentGPA(student.getStudentGPA());
        s.setStudentId(student.getStudentId());
        s.setStudentProgram(student.getStudentProgram());
    }

    public void deleteStudent(String studentId){
        for(int i=0;i<students.size(); i++){
            if(students.get(i).getStudentId().equals(studentId)){
                students.remove(i);
            }
        }
    }

}
