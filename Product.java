
public class Product {

    // Task 1: Instance variables
    String name;
    double price;
    final int id;

    // Static variable shared by all products
    static int totalProductsCreated = 0;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;

        totalProductsCreated++;
        this.id = totalProductsCreated;
    }

    // Display product information
    public void displayInfo() {
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("--------------------");
    }
}
