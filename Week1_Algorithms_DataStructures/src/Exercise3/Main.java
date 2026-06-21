package Exercise3;

public class Main {

    public static void main(String[] args) {

        Order[] orders = {

                new Order(101, "Anushka", 2500),
                new Order(102, "Rahul", 7000),
                new Order(103, "Priya", 1500),
                new Order(104, "Rohan", 4500)

        };

        System.out.println("Bubble Sort:");

        SortingAlgorithms.bubbleSort(orders);

        for (Order o : orders) {

            o.display();

        }

        System.out.println("\nQuick Sort:");

        Order[] orders2 = {

                new Order(101, "Anushka", 2500),
                new Order(102, "Rahul", 7000),
                new Order(103, "Priya", 1500),
                new Order(104, "Rohan", 4500)

        };

        SortingAlgorithms.quickSort(orders2, 0, orders2.length - 1);

        for (Order o : orders2) {

            o.display();

        }

    }
}