package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object value1 = Optional.ofNullable(null)
                .orElseGet(() -> "default value");

        Object value2 = Optional.ofNullable("any value")
                .orElseGet(() -> "default value");

        Object value3 = Optional.ofNullable("Hello")  // replace "Hello" with null for Exception..
                .orElseThrow(() -> new IllegalStateException("Exception Occurred.."));

        Optional.ofNullable("example@gmail.com").ifPresent(email -> System.out.println("Sending an email to " + email));

        Optional.ofNullable(null).ifPresentOrElse(email -> System.out.println("Sending an email to " + email),
                () -> System.out.println("Cannot Send Email.."));

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
    }
}
