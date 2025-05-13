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

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public String getBrithMonth() {
        return brithMonth;
    }

    public void setBrithMonth(String brithMonth) {
        this.brithMonth = brithMonth;
    }

    public int getSleep() {
        return sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    public int getTiredLevel() {
        return tiredLevel;
    }

    public void setTiredLevel(int tiredLevel) {
        this.tiredLevel = tiredLevel;
    }

    public boolean isEnoughSleep() {
        return enoughSleep;
    }

    public void setEnoughSleep(boolean enoughSleep) {
        this.enoughSleep = enoughSleep;
    }

    public boolean isLikeSleep() {
        return likeSleep;
    }

    public void setLikeSleep(boolean likeSleep) {
        this.likeSleep = likeSleep;
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
