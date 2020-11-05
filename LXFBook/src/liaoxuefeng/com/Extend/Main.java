package liaoxuefeng.com.Extend;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pair<Integer>  p = new Pair<>(123, 456);
        int n = add(p);
        System.out.println(n);

    }

    static int add(Pair<Integer> p) {
        Number first = p.getFirst();
        Number last = p.getLast();
        return first.intValue() + last.intValue();

    }
}
