package pl.sda.jawawwa24.usystematyzowanie.calculator;

/**
 * ... comment class ...
 *
 * @author czechowp@gmail.com
 * @since 19/09/2020
 */
final class Calculator {
    public static void main(String[] args) {
        Add adder = (c,d) -> c + d;
        System.out.println(adder.add(2.0,2.9));

        Divide divide = (c,d) -> c / d;
        System.out.println(divide.div(2.2, 2.2));

        Multiply multiply = (w,z) -> w * z;
        System.out.println(multiply.multi(2.2, 2.2));


        //GenericAdd<Integer> genericAdd = (Integer a, Integer b) -> a + b;

        GenericAdd<Integer> genericAdd = (a,b) -> a + b;
    }


}
