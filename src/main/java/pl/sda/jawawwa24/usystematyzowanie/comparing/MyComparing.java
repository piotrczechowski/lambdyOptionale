package pl.sda.jawawwa24.usystematyzowanie.comparing;

/**
 * ... comment class ...
 *
 * @author czechowp@gmail.com
 * @since 19/09/2020
 */
final class MyComparing {
    public static int comparePersons(Person first, Person second) {

        return first.getSurname().substring(1).compareTo(second.getName().substring(1));
    }
}
