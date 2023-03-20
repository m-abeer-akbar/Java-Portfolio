package Portfolio.Practical_11;

public class StudentSupportOffice {
    public static void main(String[] args) {
        // Create Student objects
        Student s1 = new Student("U0000001");
        Student s2 = new Student("U0000002");
        Student s3 = new Student("U0000003");
        Student s4 = new Student("U0000004");
        Student s5 = new Student("U0000005");

        // Create Course objects
        Module cis2206 = new Module("CIS2206");
        Module cis2360 = new Module("CIS2360");
        Module cis2205 = new Module("CIS2205");

        // Enroll students in courses
        cis2206.enrollStudent(s1);
        cis2206.enrollStudent(s5);
        cis2360.enrollStudent(s1);
        cis2360.enrollStudent(s3);
        cis2360.enrollStudent(s4);
        cis2205.enrollStudent(s2);
        cis2205.enrollStudent(s4);
        cis2205.enrollStudent(s5);

        // Print list of enrolled students for each course
        System.out.println(cis2206);
        System.out.println(cis2360);
        System.out.println(cis2205);

        // Unenroll a student from a course
        cis2360.unenrollStudent(s1);

        // Print list of enrolled students for each course
        System.out.println("\nAfter unenrolling a student:\n");
        System.out.println(cis2206);
        System.out.println(cis2360);
        System.out.println(cis2205);
    }
}
