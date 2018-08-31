package generics_collectioin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListGenerics {
    public static void main(String[] args) {
        Person sid = new Person("Sid Patel", 22);
        Person tom = new Person("Tom Cruise", 54);

        List<Person> people = new ArrayList<Person>();
        people.add(sid);
        people.add(tom);

        System.out.println(people);

        // Lists auto-resize, with generic add method
        people.add(new Person("MS Dhoni", 35));

        // Compile Error due to generics:
        // madMen.add(new Object());

        System.out.println(people);

        //Order is preserved in List

        // Iterate through Index
        System.out.println("index");
        for (int i = 0; i < people.size(); i++) {
            Person person = people.get(i);
            System.out.println(person);
        }

        //Using Iterator to iterate over collection
        System.out.println("iterator");
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person);
        }

        // Iterate using for each loop
        System.out.println("for each");
        for (Person person : people) {
            System.out.println(person);
        }

    }
}
