package generics_class_interface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MethodGenerics {
    public static void main(String[] args) {
        Person sid = new Person("Sid Patel", 22);
        Person tom = new Person("Tom Cruise", 54);
        Person dhoni = new Person("MS Dhoni", 35);

        List<Person> people = new ArrayList<>();
        people.add(sid);
        people.add(tom);
        people.add(dhoni);

        final Person youngest = min(people, new AgeComparator());
        System.out.println(youngest);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(4);
        numbers.add(1);
        numbers.add(2);
        System.out.println(min(numbers, Integer::compare));
    }

    public static <T> T min(List<T> values, Comparator<T> comparator) {
        T lowest = values.get(0);
        for (int i = 1; i < values.size(); i++) {
            final T element = values.get(i);
            if (comparator.compare(element, lowest) < 0) {
                lowest = element;
            }
        }
        return lowest;
    }
}