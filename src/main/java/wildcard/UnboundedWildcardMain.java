package wildcard;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcardMain {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        objects.add(new Object());
        objects.add(new Person("Sid Patel", 22));
        System.out.println(objects);

//        Only Null can be added here
        List<?> wildcards = new ArrayList<>();
        wildcards.add(null);
//        This is not allowed
//        wildcards.add(new Object());
        System.out.println(wildcards);


        List<? super Object> wildcardsObjects = new ArrayList<>();
        wildcardsObjects.add(null);
        //This is allowed
        wildcardsObjects.add(new Object());
        System.out.println(wildcardsObjects);
    }
}
