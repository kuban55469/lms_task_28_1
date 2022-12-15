import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Integer массивден жуп сандарды терип алынызда алардын квадраттарынын эн чонун табыныз.
         */

        List<Integer> integers = new ArrayList<>(List.of(
                1,2,4,2,5,6,3,6,2,7,47,84,8,3,42,34,43
        ));
        integers.stream().filter(x -> x %2 == 0).toList().stream().map(x ->x*x).toList()
                .stream().max(Comparator.comparing(Integer::intValue))
                .ifPresent(System.out::println);
    }
}