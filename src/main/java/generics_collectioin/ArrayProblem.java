package generics_collectioin;

import java.util.Arrays;

public class ArrayProblem {
    public static void main(String[] args) {
        Person sid = new Person("Sid Patel", 22);
        Person tom = new Person("Tom Cruise", 54);

        Person[] people = {sid, tom};
        System.out.println(people);
        System.out.println(Arrays.toString(people));

        Person dhoni = new Person("MS Dhoni", 35);

        //this will work
//        people[1] = dhoni;

        //this will not work as array length in java is immutable so we can't change it after declaration
//        people[2] = dhoni;

        //we have to implement our own method in order to add an element into an array
        people = add(dhoni, people);
        System.out.println(Arrays.toString(people));
    }

    private static Person[] add(Person person, Person[] people) {
        final int length = people.length;
        people = Arrays.copyOf(people, length + 1);
        people[length] = person;
        return people;
    }
}
