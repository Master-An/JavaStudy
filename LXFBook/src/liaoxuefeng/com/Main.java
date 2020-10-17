package liaoxuefeng.com;

public class Main {

    public static void main(String[] args) {
        Person p = new Person("小明",12);
        Student s = new Student("小红",20,99);
        PrimaryStudent ps = new PrimaryStudent("小军",9,100,5);
        System.out.println(ps.getScore());


    }
}