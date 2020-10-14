package liaoxuefeng.com;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        for (String arg : args) {
            if ("-version".equals(arg)) {
                System.out.println("v 1.0");
                break;
            }
        }

    }
}
