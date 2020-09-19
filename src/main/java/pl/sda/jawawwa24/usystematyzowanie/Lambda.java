package pl.sda.jawawwa24.usystematyzowanie;

import java.util.Optional;
import java.util.function.Function;

/**
 * ... comment class ...
 *
 * @author czechowp@gmail.com
 * @since 19/09/2020
 */

class StringMapper implements Function<String, Integer> {

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

interface DoubleString {
    String doubleDouble(String value);
}

class MyDoubleStringimp implements DoubleString {

    @Override
    public String doubleDouble(String value) {
        return value + value;
    }
}
// lambdy dzialaja tylko na interfejsach funkcyjnych

final class Lambda {

    public static void main(String[] args) {
        DoubleString myDoubleString = value -> value + value;
        System.out.println(myDoubleString);
        System.out.println(myDoubleString.doubleDouble("Zosia"));
        Function<String, Integer> myFunction = new Function<String, Integer>() {


            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        String myName = "Piotr";
        Optional<String> maybeName = Optional.ofNullable(myName);
        maybeName.map(new StringMapper());

                maybeName.map(s -> s.length());
    }
}
