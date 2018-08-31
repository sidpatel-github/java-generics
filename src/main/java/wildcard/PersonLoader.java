package wildcard;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class PersonLoader {
    private final RandomAccessFile file;

    public PersonLoader(final File file) throws FileNotFoundException {
        this.file = new RandomAccessFile(file, "rw");
    }

    public Person load() throws ClassNotFoundException {
        try {
            final String className = file.readUTF();
            final String personName = file.readUTF();
            final int age = file.readInt();

            //This is Unbounded Wildcard example
            final Class<?> personClass = Class.forName(className);
            final Constructor<?> constructor = personClass.getConstructor(String.class, int.class);
            return (Person) constructor.newInstance(personName, age);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void loadAll(final List<? super Person> people) throws ClassNotFoundException {
        Person person;

        // we can't do this as this list is Contravariant so we can only add the elements;
        //Person person1 = people.get(0);

        // This is allowed
        people.add(new Person("Sid Patel", 22));

        while ((person = load()) != null) {
            people.add(person);
        }
    }
}
