import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers =
                new ArrayList<>(Arrays.asList(1, 56, -4, 0, 10));
        // integers.forEach(System.out::println);
       // IntegerSort.sort(integers);
        //integers.forEach(System.out::println);

        List<String> strings =
                new ArrayList<>(Arrays.asList("hello", "!", "hi", "by"));
        //StringSort.sort(strings);
        // strings.forEach(System.out::println);

        List<Plane> planes =
                new ArrayList<>(Arrays.asList(
                        new Plane(2016, "BMW", "X", "White"),
                        new Plane(1995, "Boeng", "598m", "Black"),
                        new Plane(2001, "DFR", "156", "Green")));

       // planes.stream().sorted().forEach(System.out::println);


        new SortingEverything().process(integers,
                o -> {
                    IntegerSort.sort(integers);
                    integers.forEach(i -> System.out.print(i + " "));
                });
        System.out.println("\n");
        new SortingEverything().process(strings,
                o -> {
                    StringSort.sort(strings);
                    strings.forEach(System.out::println);
                });
        System.out.println();
        new SortingEverything().process(planes,
                o -> planes.stream().sorted().forEach(System.out::print));
    }


}
