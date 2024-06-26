package seedu.address.logic;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import seedu.address.logic.parser.Prefix;
import seedu.address.model.person.Person;

/**
 * Container for user visible messages.
 */
public class Messages {

    public static final String MESSAGE_UNKNOWN_COMMAND = "Unknown command";
    public static final String MESSAGE_INVALID_COMMAND_FORMAT = "Invalid command format! \n%1$s";
    public static final String MESSAGE_INVALID_PERSON_DISPLAYED_ID = "The person id provided is invalid";
    public static final String MESSAGE_PERSONS_LISTED_OVERVIEW = "%1$d persons listed!";
    public static final String MESSAGE_DUPLICATE_FIELDS =
                "Multiple values specified for the following single-valued field(s): ";

    public static final String MESSAGE_TAG_NOT_IN_TAG_LIST = "%1$s tag not in tag list!";

    public static final String MESSAGE_ID_NOT_VALID = "ID is not valid!";
    public static final String MESSAGE_INVALID_PATH =
        "Filename is not valid! Remove some non-alphanumeric characters and try again.";

    /**
     * Returns an error message indicating the duplicate prefixes.
     */
    public static String getErrorMessageForDuplicatePrefixes(Prefix... duplicatePrefixes) {
        assert duplicatePrefixes.length > 0;

        Set<String> duplicateFields =
                Stream.of(duplicatePrefixes).map(Prefix::toString).collect(Collectors.toSet());

        return MESSAGE_DUPLICATE_FIELDS + String.join(" ", duplicateFields);
    }

    /**
     * Formats the {@code person} for display to the user.
     */
    public static String format(Person person) {
        final StringBuilder builder = new StringBuilder();
        builder.append(person.getName())
                .append("; Id: ")
                .append(person.getId())
                .append("; Phone: ")
                .append(person.getPhone())
                .append("; Tags: ")
                .append(person.getTags());
        //.append("; Email: ")
        //.append(person.getEmail())
        //.append("; Address: ")


        //person.getTags().forEach(builder::append);
        return builder.toString();
    }

}
