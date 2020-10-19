package liaoxuefeng.com.StringJoiner;

import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Grace"};

        //普通字符串拼接方式
//        StringBuilder sb = new StringBuilder();
//        sb.append("Hello ");
//        for (String name: names) {
//            sb.append(name).append(", ");
//        }
//        System.out.println(sb.length());
//        sb.delete(sb.length() - 2, sb.length());
//        sb.append("!");

        //StringJoiner
//        StringJoiner sj = new StringJoiner(", ", "Hello ", "!");
//        for (String name : names) {
//            sj.add(name);
//        }
//        System.out.println(sj.toString());

        Integer n = Integer.valueOf(100);
        System.out.println(n);
    }
}
