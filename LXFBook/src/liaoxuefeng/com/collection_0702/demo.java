package liaoxuefeng.com.collection_0702;

import com.sun.tools.javac.util.List;

public class demo {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "pear", "banana");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
