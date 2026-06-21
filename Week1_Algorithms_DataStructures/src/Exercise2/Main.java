package Exercise2;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Keyboard", "Electronics"),
                new Product(103, "Mouse", "Electronics"),
                new Product(104, "Monitor", "Electronics"),
                new Product(105, "Printer", "Electronics")

        };

        System.out.println("Linear Search:");

        Product result1 = SearchAlgorithms.linearSearch(products, "Mouse");

        if(result1 != null)
            result1.display();
        else
            System.out.println("Product Not Found");

        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        System.out.println("\nBinary Search:");

        Product result2 = SearchAlgorithms.binarySearch(products, "Mouse");

        if(result2 != null)
            result2.display();
        else
            System.out.println("Product Not Found");

    }
}