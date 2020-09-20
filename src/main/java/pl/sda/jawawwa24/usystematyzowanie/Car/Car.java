package pl.sda.jawawwa24.usystematyzowanie.Car;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Optional;

/**
 * ... comment class ...
 *
 * @author czechowp@gmail.com
 * @since 20/09/2020
 */
@Data
@AllArgsConstructor
public class Car {
    Optional<Engine> maybeEngine;


}
