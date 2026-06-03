import java.util.List;

record Person(
        String name,
        int age
){}

public class PersonRecordDemo {

    public static void main(String[] args) {

        List<Person> people =
                List.of(
                        new Person("Anushka",20),
                        new Person("Rahul",17)
                );

        people.stream()
                .filter(
                        p -> p.age() >= 18
                )
                .forEach(System.out::println);

    }
}