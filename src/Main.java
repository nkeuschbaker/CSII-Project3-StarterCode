import java.util.List;
import java.util.Scanner;

public class Main {

    /* One shared list for the whole program */
    private static final StudentList studentList = new StudentList();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        studentList.createStudent(new Student("000001", "Cat", "May",      6, 1,  true,  true));
        studentList.createStudent(new Student("000002", "Dog", "October",  8, 8,  true,  true));
        studentList.createStudent(new Student("000003", "Albino Cyclops Shark", "January", 3, 8, true,  false));
        studentList.createStudent(new Student("000004", "Dog", "February", 6, 5,  false, true));
        studentList.createStudent(new Student("000005", "Pokemon", "February",10,1,false, false));
        studentList.createStudent(new Student("000006", "Dog", "January",  0,10,  true,  true));
        studentList.createStudent(new Student("000007", "Dog", "September",8, 4,  false, true));
        
        while (true) {
            System.out.println("1. Create Student");
            System.out.println("2. Read Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();      // consume newline

            switch (option) {
                case 1:
                    createStudent(scanner); 
                    break;
                case 2 :
                    readStudents();
                    break;
                case 3:
                    updateStudent(scanner);
                    break;
                case 4:
                    deleteStudent(scanner);
                    break;
                case 5:
                    System.out.println("Exiting…");
                    return;
                default: 
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
    
    private static void createStudent(Scanner sc) {
        System.out.print("ID: ");                 String id   = sc.nextLine();
        System.out.print("Favourite animal: ");   String fav  = sc.nextLine();
        System.out.print("Birth month: ");        String month= sc.nextLine();
        System.out.print("Hours of sleep: ");     int hrs     = sc.nextInt();
        System.out.print("Tired level (0-10): "); int tired   = sc.nextInt();
        System.out.print("Gets enough sleep (true/false): "); boolean enough = sc.nextBoolean();
        System.out.print("Enjoys sleeping (true/false): ");   boolean like   = sc.nextBoolean();
        sc.nextLine(); // newline

        studentList.createStudent(new Student(id, fav, month, hrs, tired, enough, like));
        System.out.println("Student created.");
    }

    private static void readStudents() {
        List<Student> students = StudentList.readStudents();
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
    
        for (Student s : students) {
            System.out.print(s.format());
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

    private static void deleteStudent(Scanner sc) {
        System.out.print("ID of student to delete: ");
        String id = sc.nextLine();
        boolean removed = studentList.removeById(id);
        System.out.println(removed ? "Student deleted." : "Student not found.");
    }
    
    
}
