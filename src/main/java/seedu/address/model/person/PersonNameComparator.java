package seedu.address.model.person;

import java.util.Comparator;

/**
 * Class for comparing two {@code Person}s according to the alphabetical order of their {@code Name}s
 */
public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        return firstPerson.getName().compareTo(secondPerson.getName());
    }
}
