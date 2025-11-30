package com.airtribe.studentmanagement.Service;

import java.util.ArrayList;
import java.util.List;

import com.airtribe.studentmanagement.entity.Course;
import com.airtribe.studentmanagement.entity.Student;

public class CourseService {

    private static List<Course> courses = new ArrayList<>();

    public void addCourse(Course course){
        courses.add(course);
    }

    public List<Course> getAllCourses(){
        return courses;
    }

    public void updateCourse(Course course){
        Course c = getCourse(course.getCourseId());
        c.setCourseFee(course.getCourseFee());
        c.setCourseId(course.getCourseId());
        c.setCourseName(course.getCourseName());
        c.setCourseTechnologies(course.getCourseTechnologies());
    }

    public Course getCourse(int courseId){
        for(Course c : courses){
            if (c.getCourseId() == courseId){
                return c;
            }
        }
        return null;
    }

    public void addStudentToCourse(Student student,Course course){
        List<Student> students = course.getStudents();
        students.add(student);
        course.setStudents(students);
    }

    public void removeStudentFromCourse(Student student,Course course){
        List<Student> students = course.getStudents();
        students.remove(student);
        course.setStudents(students);
    }

}
