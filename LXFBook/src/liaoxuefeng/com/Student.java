package liaoxuefeng.com;

public class Student extends Person {
    public int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
