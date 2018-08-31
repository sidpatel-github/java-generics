package generics_collectioin;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapGenerics {
    public static void main(String[] args) {
        Person sid = new Person("Sid Patel", 22);
        Person tom = new Person("Tom Cruise", 54);

        Map<String, Person> people = new HashMap<>();
        people.put(sid.getName(), sid);
        people.put(tom.getName(), tom);

        // foreach key
        for (String name : people.keySet()) {
            System.out.println(name);
        }

        // foreach value
        for (Person person : people.values()) {
            System.out.println(person);
        }

        // foreach entry - again two generic parameters
        for (Map.Entry<String, Person> entries : people.entrySet()) {
            System.out.println(entries.getKey());
            System.out.println(entries.getValue());
            System.out.println(entries);
        }
    }
}