package pl.sda.jawawwa24.usystematyzowanie.calculator;

/**
 * ... comment class ...
 *
 * @author czechowp@gmail.com
 * @since 19/09/2020
 */

@FunctionalInterface
public interface GenericAdd <T> {

    // Double add(Double a, Double b);

    T add(T a, T b);

}
