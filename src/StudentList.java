import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private static final List<Student> students = new ArrayList<>();

    public static void createStudent(Student s) {
        students.add(s);
    }

    public static List<Student> readStudents() {
        return students;
    }

    public static Student findById(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    public static boolean removeById(String id) {
        return students.removeIf(s -> s.getId().equals(id));
    }

    public static void updateStudent(Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(updatedStudent.getId())) {
                students.set(i, updatedStudent);
                return;
            }
        }
    }
}