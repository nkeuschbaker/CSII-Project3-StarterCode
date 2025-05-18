public class Student {
    private String id;
    private String favoriteAnimal;
    private String birthMonth;
    private int hoursSleep;
    private int tiredLevel;
    private boolean enoughSleep;
    private boolean likeSleep;

    public Student(String id, String favoriteAnimal, String birthMonth,
                   int hoursSleep, int tiredLevel,
                   boolean enoughSleep, boolean likeSleep) {
        this.id = id;
        this.favoriteAnimal = favoriteAnimal;
        this.birthMonth = birthMonth;
        this.hoursSleep = hoursSleep;
        this.tiredLevel = tiredLevel;
        this.enoughSleep = enoughSleep;
        this.likeSleep = likeSleep;
    }

    /* ── getters & setters -─ */
    public String getId()                { return id; }
    public void   setId(String id)       { this.id = id; }

    public String getFavoriteAnimal()                { return favoriteAnimal; }
    public void   setFavoriteAnimal(String fav)      { this.favoriteAnimal = fav; }

    public String getBirthMonth()                { return birthMonth; }
    public void   setBirthMonth(String month)    { this.birthMonth = month; }

    public int  getHoursSleep()                   { return hoursSleep; }
    public void setHoursSleep(int hoursSleep)     { this.hoursSleep = hoursSleep; }

    public int  getTiredLevel()                   { return tiredLevel; }
    public void setTiredLevel(int tiredLevel)     { this.tiredLevel = tiredLevel; }

    public boolean isEnoughSleep()                { return enoughSleep; }
    public void    setEnoughSleep(boolean enough) { this.enoughSleep = enough; }

    public boolean isLikeSleep()                { return likeSleep; }
    public void    setLikeSleep(boolean like)   { this.likeSleep = like; }

    @Override
    public String toString() {
        return "Student{" +
               "id='" + id + '\'' +
               ", favoriteAnimal='" + favoriteAnimal + '\'' +
               ", birthMonth='" + birthMonth + '\'' +
               ", hoursSleep=" + hoursSleep +
               ", tiredLevel=" + tiredLevel +
               ", enoughSleep=" + enoughSleep +
               ", likeSleep=" + likeSleep +
               '}';
    }
    
    //formatting cuz it looks ugly otherwise
    public String format() {
        return "ID: " + id + "\n"
             + "  Favorite Animal: " + favoriteAnimal + "\n"
             + "  Birth Month:     " + birthMonth + "\n"
             + "  Hours Sleep:     " + hoursSleep + "\n"
             + "  Tired Level:     " + tiredLevel + "\n"
             + "  Enough Sleep:    " + (enoughSleep ? "Yes" : "No") + "\n"
             + "  Likes Sleeping:  " + (likeSleep ? "Yes" : "No") + "\n"
             + "-----------------------------\n";
    }
}
