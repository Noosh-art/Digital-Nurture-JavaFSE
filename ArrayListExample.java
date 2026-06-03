import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> students =
                new ArrayList<>();

        students.add("Anushka");
        students.add("Shaleen");
        students.add("Mohit");

        for(String name : students) {

            System.out.println(name);

        }

    }
}