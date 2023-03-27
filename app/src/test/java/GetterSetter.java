public class GetterSetter {
    int std_id;
    String name;
    float grade;

    public GetterSetter(int std_id) {
        this.std_id = std_id;
        this.name=name;
        this.grade=grade;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStd_id() {
        return std_id;
    }

    public void setStd_id(int std_id) {
        this.std_id = std_id;
    }
}
