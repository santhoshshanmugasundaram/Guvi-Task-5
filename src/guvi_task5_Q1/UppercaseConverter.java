package guvi_task5_Q1;

import java.util.stream.*;

public class UppercaseConverter {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "ef");
        Stream<String> uppercaseNames = names.map(String::toUpperCase);
        uppercaseNames.forEach(System.out::println);
    }
}

//output:
//	ABC
//	D
//	EF