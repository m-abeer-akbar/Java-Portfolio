package Akbar_MohammadAbeer_u2253319.Practical_11;

import java.util.Arrays;

public class Module {
    private String courseCode;
    private Student[] enrolledStudents;
    private int enrolledCount;

    // Constructor that initializes the course code and creates an array of Student objects with a capacity of 5
    public Module(String courseCode) {
        this.courseCode = courseCode;
        this.enrolledStudents = new Student[5];
        this.enrolledCount = 0;
    }

    // Method that adds a student to the array of enrolled students and sorts the array
    public void enrollStudent(Student student) {
        // Check if student is not already enrolled
        for (int i = 0; i < enrolledCount; i++) {
            if (enrolledStudents[i].getStudentID().equals(student.getStudentID())) {
                System.out.println("\nERROR: Cannot enroll student\nStudent is already enrolled in this course\n\n");
                return;
            }
        }
        // Add student to the array
        enrolledStudents[enrolledCount] = student;
        // Increase enrolledCount by one
        enrolledCount++;
        // Sort the array
        Arrays.sort(enrolledStudents, 0, enrolledCount);
    }

    // Method that removes a student from the array of enrolled students
    public void unenrollStudent(Student student) {
        // Find the index of the student in the array
        int index = -1;
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i].getStudentID().equals(student.getStudentID())) {
                index = i;
                break;
            }
        }
        // Remove the student from the array by setting the element to null
        enrolledStudents[index] = null;
        enrolledCount--;
        // Shift the elements to the left to remove the null element
        for (int i = index; i < enrolledStudents.length - 1; i++) {
            enrolledStudents[i] = enrolledStudents[i + 1];
        }
    }

    // Method that returns a string representation of the Course object
    @Override
    public String toString() {
        StringBuilder course = new StringBuilder("Course[" + courseCode + "]\nEnrolled Students:\n");
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                course.append(enrolledStudents[i]).append("\n");
            }
        }
        return course.toString();
    }
}