package generics_collectioin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetGenerics {
    public static void main(String[] args) {
        Person sid = new Person("Sid Patel", 22);
        Person tom = new Person("Tom Cruise", 54);

        Set<Person> people = new HashSet<>();
        people.add(sid);
        people.add(tom);
        people.add(new Person("MS Dhoni", 35));
        //Store unique elements only
        people.add(sid);

        //Order is not preserved in "Simple" Set it may print out of order during iteration
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
