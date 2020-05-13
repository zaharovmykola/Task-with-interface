import java.util.List;

public class StringSort {

    public static void sort(List<String> strings) {
        boolean sorted;
        do {
            sorted = true;
            for (int i = 0; i < strings.size() - 1; i++) {
                // Compare

                if (strings.get(i).length() - strings.get(i + 1).length() > 0) {
                    // Swap
                    String  tempInteger = strings.get(i);
                    strings.set(i, strings.get(i + 1));
                    strings.set(i + 1, tempInteger);
                    sorted = false;
                }
            }
        } while (!sorted);
    }


}
