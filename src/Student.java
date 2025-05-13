public class Student {
    private String id;
    private String pet;
    private String brithMonth;
    private int sleep;
    private int tiredLevel;
    private boolean enoughSleep;
    private boolean likeSleep;

    public Student(String id, String pet, String brithMonth, int sleep, int tiredLevel, boolean enoughSleep, boolean likeSleep) {
        this.id = id;
        this.pet = pet;
        this.brithMonth = brithMonth;
        this.sleep = sleep;
        this.tiredLevel = tiredLevel;
        this.enoughSleep = enoughSleep;
        this.likeSleep = likeSleep;
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
