package Akbar_MohammadAbeer_u2253319.Practical_11;

public class Student implements Comparable<Student> {
    private String studentID;

    // Constructor that initializes the student ID
    public Student(String studentID) {
        this.studentID = studentID;
    }

    // Method that returns the student ID
    public String getStudentID() {
        return studentID;
    }

    // Method that returns a string representation of the Student object
    @Override
    public String toString() {
        return "Student ID: '" + studentID + '\'';
    }

    // Method that compares two Student objects based on their student IDs in ascending order
    @Override
    public int compareTo(Student other) {
        return this.studentID.compareTo(other.studentID);
    }
}
