import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private static List<Student> students = new ArrayList<>();

    public static void createStudent(Student student) {
        students.add(student);
    }

    public static List<Student> readStudents() {
        return students;
    }

    public static void updateStudent(Student updatedStudent) {
        for (Student s : students) {
            if (s.getId().equals(updatedStudent.getId())) {
                s.setReasoning(updatedStudent.getReasoning());
                s.setMonth(updatedStudent.getMonth());
                s.setSiblings(updatedStudent.getSiblings());
                s.setGrade(updatedStudent.getGrade());
                s.setHandicap(updatedStudent.getHandicap());
                s.setFavNum(updatedStudent.isFavNum());
                s.setCD(updatedStudent.isCD());
                break;
            }
        }

    }

    public static boolean deleteStudent(String id) {
        return students.removeIf(s -> s.getId().equals(id));
    }
}