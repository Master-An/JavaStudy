package liaoxuefeng.com;

public class Person {
    private String name;
    private int birth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public int getAge() {
        return calcAge(2019);
    }

    private int calcAge(int currenyYear) {
        return currenyYear - this.birth;
    }
}
