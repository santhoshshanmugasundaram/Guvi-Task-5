package guvi_task5_Q3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentFilter {
    public static void main(String[] args) {
        List<String> studentNames = Arrays.asList("Aravind", "Buvana", "Chandra", "Arun", "David", "Elango", "Abi", "Frank", "Avi", "Gayu");

        List<String> studentsWithA = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Students whose names start with 'A': " + studentsWithA);
    }
}
//output:
//	Students whose names start with 'A': [Aravind, Arun, Abi, Avi]