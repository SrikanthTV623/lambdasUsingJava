package in.stackroute.streams;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        streams();
    }
    static void streams() {

        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<String> names = Stream.of("John", "Sam", "Tom", "Jerry", "Mike", "Ashley");

        Consumer<String> print = (s) -> System.out.println(s);
        Consumer<String> printUpper = (s) -> System.out.println(s.toUpperCase());

        Comparator<String> compare = (s1, s2) -> s1.compareTo(s2);

        // Terminal operation results in a non-stream result
        names.forEach(print);

        // Intermediate operation results in a new stream
        //names.sorted(compare).forEach(print);

    }


}
