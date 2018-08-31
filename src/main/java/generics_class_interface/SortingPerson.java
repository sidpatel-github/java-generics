package generics_class_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingPerson {
    public static void main(String[] args) {
        Person sid = new Person("Sid Patel", 22);
        Person tom = new Person("Tom Cruise", 54);
        Person dhoni = new Person("MS Dhoni", 35);

        List<Person> people = new ArrayList<>();
        people.add(sid);
        people.add(tom);
        people.add(dhoni);

        System.out.println(people);
        Collections.sort(people, new AgeComparator());
        System.out.println(people);
        Collections.sort(people, new ReverseComparator<>(new AgeComparator()));
        System.out.println(people);
    }
}