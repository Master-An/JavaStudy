package liaoxuefeng.com.StringJoiner;

public class Person implements Comparable<Person> {
    String name;
    int score;

    Person(String name, int score) {
        this.name = name;
        this.score = score;

    }

    public String toString() {
        return this.name + "," + this.score;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
