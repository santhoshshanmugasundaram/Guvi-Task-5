package guvi_task5_Q2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyStringChecker {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> nonEmptyStrings = strings.stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList());

        System.out.println("Non-empty strings: " + nonEmptyStrings);
    }
}
//output:
//	Non-empty strings: [abc, bc, efg, abcd, jkl]
