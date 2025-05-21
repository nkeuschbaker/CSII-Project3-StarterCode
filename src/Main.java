import java.util.List;
import java.util.Scanner;

public class Main {
    private static final StudentList studentList = new StudentList();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TO DO: Create a Student List object that stores preloaded student objects
        // Student objects should be each student with info you collected

        Student a = new Student("001","It is very fun and relaxing game.", "August", 1, 10, 16,false, false );
        Student b = new Student("002","for fun.", "July", 1, 9, 10,true, false );
        Student c = new Student("003","It's fun", "June", 2, 10, 18,true, false );
        Student d = new Student("004","It is fun to improve and it is a mix of a lot of different skills.", "April", 1, 10, 22,true, false );
        Student e = new Student("005","Because I enjoy it, and it is kinda like a video game but more fun and in nature.", "March", 1, 10, 16,false, false );
        Student f = new Student("006","Because it's challenging and fun", "December", 1, 10, 20,true, false );
        Student g = new Student("007","Because I think it's really fun!", "June", 2, 10, 18,true, false );
        Student h = new Student("008", "I got into golf by playing with my dad, the sport can be very rewarding and golf courses are beautiful.", "July", 1, 12, 20,true, false );
        Student i = new Student("009", "Its fun", "September", 2, 11, 10, true, false);
        Student j = new Student ("010", "I started playing with my dad and brother and I really loved it.", "June", 1, 12, 20, true, false);
        Student k = new Student("011","Its fun and with my friends", "July", 2, 9, 17, true, false);
        //
        //
        //
        //
        // testing
        // audrey
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
        System.out.print("Enter reasoning: ");
        String reasoning = scanner.nextLine();
        // TO DO 1: fill out the rest of this
        System.out.print("Enter second favorite month: ");
        String month = scanner.nextLine();
        System.out.print("Enter number of siblings: ");
        int siblings = scanner.nextInt();
        System.out.print("Enter grade: ");
        int grade = scanner.nextInt();
        System.out.print("Enter handicap index: ");
        int handicap = scanner.nextInt();
        System.out.print("Enter has a favorite number?: ");
        boolean favNum =  scanner.nextBoolean();
        System.out.print("Enter dogs over cats?: ");
        boolean cD =  scanner.nextBoolean();


        // TO DO 2 : create a student object with this information
        
        StudentList.createStudent(new Student(id,reasoning, month,siblings,grade,handicap,favNum,cD));
        System.out.println("Student created successfully!");
    }

    private static void readStudents(Scanner scanner) {
        List<Student> students = StudentList.readStudents();
        // TO DO 3: print out each student
    }

    private static void updateStudent(Scanner scanner) {
        // TO DO: ask for new information to update student
        System.out.print("Enter ID of student to update: ");
        String id = scanner.nextLine();

        System.out.print("Why Do You Play Golf?: ");
        String reasoning = scanner.nextLine();

        System.out.print("Enter Second Favorite Month: ");
        String month = scanner.nextLine();

        System.out.print("Enter Number of Siblings: ");
        int siblings = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Grade: ");
        int grade = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Handicap in Golf: ");
        int handicap = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.println("Has a Favorite Number? True/False");
        boolean favNum = scanner.nextBoolean();
        scanner.nextLine();

        System.out.print("True or False, You Like Cats more than Dogs: ");
        boolean cD = scanner.nextBoolean();
        scanner.nextLine(); // consume newline

        Student student = new Student(id, reasoning, month, siblings, grade, handicap, favNum, cD);
        StudentList.updateStudent(student);

        System.out.println("Student updated successfully!");
    }


    private static void deleteStudent(Scanner scanner) {
        // TO DO: ask for student ID and store in a variable
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        boolean removed = studentList.deleteStudent(id);
        if(removed) System.out.println("Student deleted successfully!");
        else System.out.println("Student not found!");
    }
}
