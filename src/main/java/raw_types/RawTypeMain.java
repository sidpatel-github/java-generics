package raw_types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RawTypeMain {
    public static void main(String[] args) {
        List<Object> values = new ArrayList();
        values.add("abc");
        values.add(1);
        values.add(new Object());

        List rawtype = values;
        // we can do this due to backward compatibility but ot will create problem
        // while iterating
        List<String> strings = rawtype;

        for (String element : strings) {
            System.out.println(element);
        }

        Iterator iterator = values.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(element);
        }
    }
}
