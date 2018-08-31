package wildcard;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

public class PersonSaver {
    private final RandomAccessFile file;

    public PersonSaver(final File file) throws FileNotFoundException {
        this.file = new RandomAccessFile(file, "rw");
    }

    public void save(Person person) throws IOException {
        file.writeUTF(person.getClass().getName());
        file.writeUTF(person.getName());
        file.writeUTF(String.valueOf(person.getAge()));
    }

    public void saveAllArray(final Person[] people) throws IOException {
        for (Person person : people) {
            save(person);
        }
    }

    public void saveAllList(final List<Person> people) throws IOException {
        for (Person person : people) {
            save(person);
        }
    }

    public void saveAllListUsingUpperBound(final List<? extends Person> people) throws IOException {
        // ********** OR **********
//    public <T extends Person> void saveAllListUsingUpperBound(final List<T> people) throws IOException {

//         This is not allowed as this list is covariant so we can only read the elements
//         people.add(new Person("Sid Patel", 22));

//         This is allowed
//         people.get(0);
        for (Person person : people) {
            save(person);
        }
    }

}