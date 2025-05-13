import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student("000001", "cat", "May", 6, 1, true, true);
        Student student2 = new Student("000002", "Dog", "October", 8, 8, true, true);
        Student student3 = new Student("000003", "Albino Cyclops Shark", "January", 3, 8, true, false);
        Student student4 = new Student("000004", "Dog", "February", 6, 5, false, true);
        Student student5 = new Student("000005", "Pokemon", "February", 10, 1, false, false);
        Student student6 = new Student("000006", "Dog", "January", 0, 10, true, true);
        Student student7 = new Student("000007", "Dog", "September", 8, 4, false, true);
        // TO DO: Create a Student List object that stores preloaded student objects

        
        // Student objects should be each student with info you collected

        while (true) {
            System.out.println("1. Create Student");
            System.out.println("2. Read Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (option) {
                case 1:
                    createStudent(scanner);
                    break;
                case 2:
                    readStudents(scanner);
                    break;
                case 3:
                    updateStudent(scanner);
                    break;
                case 4:
                    deleteStudent(scanner);
                    break;
    private static void createStudent(Scanner scanner) {
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter favorite color: ");
        String favoriteColor = scanner.nextLine();
        // TO DO 1: fill out the rest of this

        // TO DO 2 : create a student object with this information
        
        StudentList.createStudent(student);
        System.out.println("Student created successfully!");
    }

    private static void readStudents(Scanner scanner) {
        List<Student> students = StudentList.readStudents();
        // TO DO 3: print out each student
    }

    private static void updateStudent(Scanner scanner) {
        System.out.println("Student created successfully!");
    }

    private static void readStudents(Scanner scanner) {
        List<Student> students = StudentList.readStudents();
        // TO DO: print out each student
    }

    private static void updateStudent(Scanner scanner) {
        // TO DO: ask for new information to update student

        StudentList.deleteStudent(student);
        System.out.println("Student deleted successfully!");
    }
}

    private static void deleteStudent(Scanner scanner) {
        // TO DO: ask for student ID and store in a variable

        Student student = new Student(id, "", "");
        StudentList.deleteStudent(student);
        System.out.println("Student deleted successfully!");
    }
}