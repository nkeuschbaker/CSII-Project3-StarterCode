import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void createStudent(Scanner scanner) {
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        // TO DO 1: fill out the rest of this
        System.out.print("Enter Hours of Sleep (Round to Nearest Integer): ");
        String hrsSleep = scanner.nextLine();

        System.out.print("How Tired Do You Feel Today (Round to Nearest Integer): ");
        String tiredInt = scanner.nextLine();

        System.out.print("True or False, You Like to Sleep? ");
        String likeSleep = scanner.nextLine();

        System.out.print("True or False, You Like to Sleep? ");
        String enoughSleep = scanner.nextLine();

        System.out.print("What Month Were You Born In? ");
        String monthBornIn = scanner.nextLine();

        System.out.print("What is Your Favorite Type of Pet: ");
        String favPet = scanner.nextLine();

        // TO DO 2 : create a student object with this information
        Student student = new Student(id, favPet, monthBornIn, hrsSleep, tiredInt, enoughSleep, likeSleep);
        StudentList.createStudent(student);
        System.out.println("Student created successfully!");
    }

    private static void readStudents(Scanner scanner) {
        List<Student> students = StudentList.readStudents();
        // TO DO: print out each student
    }

    private static void updateStudent(Scanner scanner) {
        // TO DO: ask for new information to update student

        Student student = new Student(id, name, course);
        StudentList.updateStudent(student);
        System.out.println("Student updated successfully!");
    }

    private static void deleteStudent(Scanner scanner) {
        // TO DO: ask for student ID and store in a variable

        Student student = new Student(id, "", "");
        StudentList.deleteStudent(student);
        System.out.println("Student deleted successfully!");
    }
}