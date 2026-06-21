package Exercise1;

import java.util.HashMap;

public class Inventory {

    HashMap<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.productId, product);
        System.out.println("Product Added Successfully!");
    }

    public void updateProduct(int id, int quantity, double price) {

        if (products.containsKey(id)) {

            Product p = products.get(id);

            p.quantity = quantity;
            p.price = price;

            System.out.println("Product Updated Successfully!");

        } else {

            System.out.println("Product Not Found!");

        }

    }

    public void deleteProduct(int id) {

        if (products.containsKey(id)) {

            products.remove(id);
            System.out.println("Product Deleted Successfully!");

        } else {

            System.out.println("Product Not Found!");

        }

    }

    public void displayInventory() {

        if (products.isEmpty()) {

            System.out.println("Inventory is Empty.");

        } else {

            for (Product p : products.values()) {

                p.displayProduct();

            }

        }

    }

}