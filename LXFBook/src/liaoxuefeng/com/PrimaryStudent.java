package liaoxuefeng.com;

public class PrimaryStudent extends Student {
    public int grade;

    public PrimaryStudent(String name, int age, int score, int grade) {
        super(name, age, score);
        this.grade = grade;
    }
}
