package Exercise2;

public class SearchAlgorithms {

    // Linear Search
    public static Product linearSearch(Product[] products, String name) {

        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }

        return null;
    }

    // Binary Search (Array must be sorted by productName)
    public static Product binarySearch(Product[] products, String name) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int compare = products[mid].productName.compareToIgnoreCase(name);

            if (compare == 0)
                return products[mid];

            if (compare < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }
}