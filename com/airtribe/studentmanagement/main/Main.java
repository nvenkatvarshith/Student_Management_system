package com.airtribe.studentmanagement.main;

import java.util.Scanner;

import com.airtribe.studentmanagement.Service.CourseService;
import com.airtribe.studentmanagement.Service.StudentService;
import com.airtribe.studentmanagement.entity.Course;
import com.airtribe.studentmanagement.entity.GraduateStudent;
import com.airtribe.studentmanagement.entity.Student;

//default class - this class can be accessed only in this package
class Main {
    //static - class level - no need to create instance to access this variable
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        System.out.println("Hello Admin, Welcome to SMS");
        System.out.println("---------------------------------------");
        CourseService courseService = new CourseService();
        StudentService studentService = new StudentService();
        //local variables - they should be initialized
        int option = 0;
        while (true) {
            System.out.println("Select one of the below options ");
            System.out.println("What do you want to manage \n 1. Student \n 2. Course \n 3. Exit");
            option = scanner.nextInt();
            if (option == 1) {
                int studentOption = 0;
                do {
                    System.out.println("-----------Student Menu -------------------");
                    System.out.println("Select one of the below options ");
                    System.out.println(
                            "What do you want to manage \n 1. Add Student \n 2. Delete Student \n 3. Update Student \n 4. Get Student Details \n 5. Exit");
                    studentOption = scanner.nextInt();
                    switch (studentOption) {
                        case 1:
                            studentService.addStudent(collectStudentDetails());
                            System.out.println("Student added successfully");
                            break;

                        case 2:
                            System.out.println("Enter the student id to be deleted");
                            String studentid = scanner.next();
                            studentService.deleteStudent(studentid);
                            System.out.println("Student deletion completed");
                            break;

                        case 3:
                            System.out.println("Update student details");
                            System.out.println("Enter same id");
                            studentService.updateStudent(collectStudentDetails());
                            break;

                        case 4:
                            System.out.println("Enter id of student to be fetched");
                            String id = scanner.next();
                            Student s = studentService.getStudentById(id);
                            if(s != null) {
                                s.displayStudentDetails();
                            } else{
                                System.out.println("Student not found");
                            }
                            break;

                        default:
                            break;
                    }
                } while (studentOption != 5);
            } else if (option == 2) {
                int courseOption = 0;
                do {
                    System.out.println("-----------Course Menu -------------------");
                    System.out.println("Select one of the below options ");
                    System.out.println(
                            "What do you want to manage \n 1. Add Course \n 2. Update course \n 3. Get Course Details \n 4. Get All Courses \n 5. Add student id to course \n 6. Remove Student from course \n 7. Exit");
                    courseOption = scanner.nextInt();
                    switch (courseOption) {
                        case 1:
                            courseService.addCourse(collectCourseDetails());
                            break;

                        case 2:
                            courseService.updateCourse(collectCourseDetails());
                            break;

                        case 3:
                            System.out.println("Enter id of course to be fetched");
                            int courseId = scanner.nextInt();
                            courseService.getCourse(courseId).displayCourseDetails();
                            break;

                        case 4:
                            for(Course course: courseService.getAllCourses()){
                                course.displayCourseDetails();
                            }
                            break;

                        case 5:
                            System.out.println("Enter studentID to be added to course");
                            String id = scanner.next();
                            Student s = studentService.getStudentById(id);
                            System.out.println("Enter course id to which student needs to be added");
                            int cid = scanner.nextInt();
                            Course c = courseService.getCourse(cid);
                            courseService.addStudentToCourse(s,c);
                            System.out.println("Student successfully added to course!!!");
                            break;

                        case 6:
                            System.out.println("Enter studentID to be Removed from course");
                            String sid = scanner.next();
                            Student student = studentService.getStudentById(sid);
                            System.out.println("Enter course id from which student needs to be removed");
                            int courseid = scanner.nextInt();
                            Course course = courseService.getCourse(courseid);
                            courseService.removeStudentFromCourse(student,course);
                            System.out.println("Student successfully removed from course!!!");
                            break;
                        
                        default:
                            break;
                    }

                } while (courseOption != 7);
            } else{
                break;
            }
        }
    }

    public static Student collectStudentDetails() {
        System.out.println("Enter Student Name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter Student Age:");
        int age = scanner.nextInt();
        System.out.println("Enter Student Gender:");
        String gender = scanner.next();
        System.out.println("Enter Student Phone Number:");
        String phoneNo = scanner.next();
        System.out.println("Enter Student Email:");
        String email = scanner.next();
        System.out.println("Enter Student ID:");
        String id = scanner.next();
        System.out.println("Enter Student Program:");
        String program = scanner.next();
        System.out.println("Enter Student GPA:");
        Double gpa = scanner.nextDouble();
        System.out.println("Is student a graduate(Y/N)");
        String opt = scanner.next();
        if (opt.equals("y")) {
            System.out.println("Enter Student Title:");
            scanner.nextLine();
            String title = scanner.nextLine();
            System.out.println("Enter Student Research Paper:");
            String research = scanner.nextLine();
            return new GraduateStudent(name, age, gender, phoneNo, email, id, program, gpa, title, research);
        } else {
            return new Student(name, age, gender, phoneNo, email, id, program, gpa);
        }
    }

    public static Course collectCourseDetails() {
        System.out.println("Enter course id:");
        int courseId = scanner.nextInt();
        System.out.println("Enter course name");
        scanner.nextLine();
        String courseName = scanner.nextLine();
        System.out.println("Course technologies");
        System.out.println("Enter number of courses");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] courses = new String[n];
        for (int i = 0; i < n; i++) {
            courses[i] = scanner.next();
        }
        System.out.println("Enter course fee");
        int courseFee = scanner.nextInt();
        return new Course(courseId, courseName, courses, courseFee);
    }
}
