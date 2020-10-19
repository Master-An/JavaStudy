package liaoxuefeng.com.beans;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class Main {
//    public static void main(String[] args) throws IntrospectionException {
//        BeanInfo info = Introspector.getBeanInfo(Person.class);
//        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
//            System.out.println(pd.getName());
//            System.out.println(" " + pd.getReadMethod());
//            System.out.println(" " + pd.getWriteMethod());
//        }
//
//    }

    public static void main(String[] args) {
        Weekday day = Weekday.SUN;
        if (day.dayValue == 1 || day.dayValue == 2 ) {
            System.out.println("Work at home!");
        } else {
            System.out.println("Work at office!");
        }
    }
}

enum Weekday {
    SUN(0,"星期日"), MON(1,"星期一"), TUE(2,"星期二");

    public final int dayValue;
    private final String chinese;

    private Weekday(int dayValue, String chinese) {
        this.dayValue = dayValue;
        this.chinese = chinese;
    }

    @Override
    public String toString() {
        return this.chinese;
    }
}
