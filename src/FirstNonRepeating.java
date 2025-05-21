import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String string = "swiss";
        System.out.println(usingStreams(string));
        System.out.println(firstNonRepeating(string));
    }

    public static String firstNonRepeating(String string) {
        List<Character> set = new ArrayList<>();
        for (Character c : string.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
            } else {
                set.remove(c);
            }
        }

        return set.getFirst().toString();
    }

    public static String usingStreams(String string) {
        return string.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey().toString())
                .findFirst()
                .orElse("");
    }
}
