package wildcard;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class WildcardMain {
    public static void main(String[] args) {

        //Creating Partner and Employee objects
        Person dhoni = new Partner("MS Dhoni", 35);
        Partner sid = new Partner("Sid Patel", 22);
        Employee tom = new Employee("Tom Cruise", 54);

        //Creating Person saver object
        File file = new File("person.txt");
        PersonSaver personSaver = null;
        PersonLoader personLoader = null;
        try {
            personSaver = new PersonSaver(file);
            personLoader = new PersonLoader(file);


            //********** Array Problems **********
            Partner[] partners = new Partner[2];
            //This will not give us compile time error but at runtime it will
            // through an error just because arrays are covariant in java
            // so here we are trying to add an "Employee" object in to an array
            // which is pointing to "Partner's" object.
            Person[] people = partners;
            people[0] = sid;
            people[1] = tom;
            personSaver.saveAllArray(people);
            //********************

            //********** List Problems **********

            // This will work because we can add sub classes into list
            // and we are passing "Person" object which is what expected
            // in saveAllList method definition
            List<Person> peopleList = new ArrayList<>();
            peopleList.add(sid);
            peopleList.add(tom);
            personSaver.saveAllList(peopleList);

            // Here we are passing "Partner" object but expected type is
            // "Person" so it will throw an "compile time" error.
            List<Partner> partnerList = new ArrayList<>();
            partnerList.add(sid);

            /*
            List<Employee> employeeList = new ArrayList<>();
            // This was allowed in array but here it's not allowed because List is not covariant
            peopleList = employeeList;
            */

            // we can't do that as we can include only the objects
            // which is subclass or given class or the object of it's own class

            // partnerList.add(tom);

            //personSaver.saveAllList(partnerList);
            //********************


            //********** Upper Bounded List **********

            // we can do this as
            personSaver.saveAllListUsingUpperBound(partnerList);

            //********************

            //********** Lower Bounded List **********
            List<Object> peopleLoad = new ArrayList<>();
            personLoader.loadAll(peopleLoad);
            //********************

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
