package Exercise1;

public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product p1 = new Product(101, "Laptop", 10, 65000);
        Product p2 = new Product(102, "Mouse", 25, 500);
        Product p3 = new Product(103, "Keyboard", 15, 1200);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        System.out.println("\nCurrent Inventory:");
        inventory.displayInventory();

        inventory.updateProduct(102, 30, 550);

        System.out.println("\nAfter Update:");
        inventory.displayInventory();

        inventory.deleteProduct(101);

        System.out.println("\nAfter Delete:");
        inventory.displayInventory();

    }

}