package abstractClasses;

/**
 * @author ansiqi
 * @date 2021/10/14
 */
public class PersonTest {

    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");
//        Object obj = new Employee();
//        Employee e = (Employee) obj;

        for (Person p: people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}
