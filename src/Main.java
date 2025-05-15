import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TO DO: Create a Student List object that stores preloaded student objects
        Student student1 = new Student("000001", "cat", "May", 6, 1, true, true);
        Student student2 = new Student("000002", "Dog", "October", 8, 8, true, true);
        Student student3 = new Student("000003", "Albino Cyclops Shark", "January", 3, 8, true, false);
        Student student4 = new Student("000004", "Dog", "February", 6, 5, false, true);
        Student student5 = new Student("000005", "Pokemon", "February", 10, 1, false, false);
        Student student6 = new Student("000006", "Dog", "January", 0, 10, true, true);
        Student student7 = new Student("000007", "Dog", "September", 8, 4, false, true);

        // Student objects should be each student with info you collecteds
        StudentList studentList = new StudentList();
        studentList.createStudent(student1);
        studentList.createStudent(student2);
        studentList.createStudent(student3);
        studentList.createStudent(student4);
        studentList.createStudent(student5);
        studentList.createStudent(student6);
        studentList.createStudent(student7);

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
        // TO DO: fill out the rest of this

        System.out.print("Enter Favorite Animal: ");
        String favPet = scanner.nextLine();

        System.out.print("Enter Month Born In: ");
        String monthBornIn = scanner.nextLine();

        System.out.print("Enter Hours of Sleep (Round to Nearest Integer): ");
        int hrsSleep = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline
    
        System.out.print("Enter How Tired You Are (Round to Nearest Integer): ");
        int tiredLevel = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline
    
        System.out.print("True or False, Do You Get Enough Sleep: ");
        boolean enoughSleep = scanner.nextBoolean();
        scanner.nextLine(); // Consume leftover newline
    
        System.out.print("Enter Do You Enjoy Sleeping (Yes, No, Sometimes, etc.): ");
        boolean likeSleep = scanner.nextBoolean();
        scanner.nextLine();

        // TO DO: create a student object with this information
        Student student = new Student(id, favPet, monthBornIn, hrsSleep, tiredLevel, enoughSleep, likeSleep);
        StudentList.createStudent(student);
        System.out.println("Student created successfully!");
    }

    private static void readStudents(Scanner scanner) {//bryan
        List<Student> students = StudentList.readStudents();
        if(students.isEmpty()) System.out.println("No Students");
        // TO DO: print out each student
        for(Student s : students){
            System.out.println(s));
        }
    }

    private static void updateStudent(Scanner scanner) {
    System.out.print("Enter ID of student to update: ");
    String id = scanner.nextLine();

    System.out.print("Enter new Favorite Animal: ");
    String favPet = scanner.nextLine();

    System.out.print("Enter new Month Born In: ");
    String monthBornIn = scanner.nextLine();

    System.out.print("Enter new Hours of Sleep (Round to Nearest Integer): ");
    int hrsSleep = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter new Tired Level (Round to Nearest Integer): ");
    int tiredLevel = scanner.nextInt();
    scanner.nextLine();

    System.out.print("True or False, Do You Get Enough Sleep: ");
    boolean enoughSleep = scanner.nextBoolean();
    scanner.nextLine();

    System.out.print("True or False, Do You Enjoy Sleeping: ");
    boolean likeSleep = scanner.nextBoolean();
    scanner.nextLine();

    Student student = new Student(id, favPet, monthBornIn, hrsSleep, tiredLevel, enoughSleep, likeSleep);
    StudentList.updateStudent(student);
    System.out.println("Student updated successfully!");
}


    private static void deleteStudent(Scanner scanner) {//bryan
        // TO DO: ask for student ID and store in a variable   
        System.out.print("Enter student ID to delete: ");
        String id = scanner.nextLine();

        Student student = new Student(id, "", "");
        StudentList.deleteStudent(student);
        System.out.println("Student deleted successfully!");
    }
}