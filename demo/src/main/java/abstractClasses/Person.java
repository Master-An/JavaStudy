package abstractClasses;

/**
 * @author ansiqi
 * @date 2021/10/14
 */
public abstract class Person {
    public abstract String getDescription();
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
