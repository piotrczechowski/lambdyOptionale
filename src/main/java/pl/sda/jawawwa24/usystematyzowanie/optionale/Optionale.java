package pl.sda.jawawwa24.usystematyzowanie.optionale;

import java.util.Optional;

/**
 * ... comment class ...
 *
 * @author czechowp@gmail.com
 * @since 19/09/2020
 */
final class Optionale {
    public static void main(String[] args) {

     //   getNick().length();
       // getNickWithOptional().get();

        getNickWithOptional()
                .ifPresent(s -> {});

        getNickWithOptional()
                .map(s -> s.length())
                .ifPresent(integer -> System.out.println("Nick len:" + integer));
    }

    static String getNick() {
        return null;
    }

    static Optional<String> getNickWithOptional() {

        return Optional.ofNullable(null);

    }

}
