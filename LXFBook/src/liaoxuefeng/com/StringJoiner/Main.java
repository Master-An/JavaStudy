package liaoxuefeng.com.StringJoiner;


//import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Person[] ps = new Person[] {
                new Person("Bob", 61),
                new Person("Alice",88),
                new Person("Lily",75),
        };
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));



    }
}
