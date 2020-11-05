package liaoxuefeng.com.mapLearn;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo {

    public static void main(String[] args) {
        Map<Student, Integer> map = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                if (o1.score == o2.score) {
                    return 0;
                }
                return o1.score > o2.score ? -1 : 1;
            }

        });

        map.put(new Student("Tom", 77), 1);
        map.put(new Student("Bob", 66), 2);
        map.put(new Student("Lily", 99), 3);
        for (Student key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.get(new Student("Bob", 66)));


    }
}

