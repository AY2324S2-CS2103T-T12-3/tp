package seedu.address.model.person;

import java.util.Comparator;

/**
<<<<<<< .merge_file_cZVOia
 * Class for comparing two {@code Person}s according to the alphabetical order of their {@code Name}s
=======
 * Class for comparing two Persons according to the alphabetical order of their full names
>>>>>>> .merge_file_CBjWs7
 */
public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        return firstPerson.getName().compareTo(secondPerson.getName());
    }
}
