package pl.sda.jawawwa24.usystematyzowanie.Car;

import lombok.Data;

import java.util.Optional;

/**
 * ... comment class ...
 *
 * @author czechowp@gmail.com
 * @since 20/09/2020
 */
@Data
final class ExampleCar {

    public static void main(String[] args) {

    }
        static void chceckLightFromCar (Car car) {
            Optional.ofNullable(car)
                    .flatMap(car1 -> car1.maybeEngine)
                    .map(engine -> engine.getSpark())
                    .flatMap(spark -> spark.getLight())
                    .map(light -> light.getLigh())
                    .ifPresent(string -> System.out.println(string));
        }
}


