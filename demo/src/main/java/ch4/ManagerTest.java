package ch4;

/**
 * @author ansiqi
 * @date 2021/10/12
 */
public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Carl Cracker", 8000, 1987, 12, 15);
        boss.setBonus(5000);

        System.out.println(boss.getSalary());
    }
}
