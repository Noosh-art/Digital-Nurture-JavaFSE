import java.util.*;

public class LambdaExample {

    public static void main(String[] args) {

        List<String> list =
                Arrays.asList(
                        "Orange",
                        "Apple",
                        "Banana"
                );

        Collections.sort(
                list,
                (a,b) -> a.compareTo(b)
        );

        System.out.println(list);

    }
}