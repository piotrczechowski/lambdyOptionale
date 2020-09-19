package pl.sda.jawawwa24.usystematyzowanie.comparing;

import java.util.List;

/**
 * ... comment class ...
 *
 * @author czechowp@gmail.com
 * @since 19/09/2020
 */
public class Person {



    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    static int orderPeson (Person one, Person two) {
        return one.name.compareTo(two.name);
    }

    public static void main(String[] args) {
//        Person person1 = new Person("Wojtek", "Solos");
//        Person person2 = new Person("Michal", "Kwas");
        List<Person> personsList = List.of(new Person("olaf", "ww"),
                new Person("andrzekj", "lichota"));

//      personsList.sort(((o1, o2) -> Person.orderPeson(o1,o2)));
        personsList.sort((Person::orderPeson));
//        personsList.sort((first, second) -> MyComparing.comparePersons(first, second));
        personsList.sort(MyComparing::comparePersons);
    }


}
