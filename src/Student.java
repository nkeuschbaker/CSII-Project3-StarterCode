public class Student {
    private String id;
    private String reasoning;
    private String month;
    private int siblings;
    private int grade;
    private int handicap;
    private boolean favNum;
    private boolean cD;


    public Student(String id, String reasoning, String month, int siblings, int grade, int handicap, boolean favNum, boolean cD) {
        this.id = id;
        this.reasoning = reasoning;
        this.month = month;
        this.siblings = siblings;
        this.grade = grade;
        this.handicap = handicap;
        this.favNum = favNum;
        this.cD = cD;

    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}