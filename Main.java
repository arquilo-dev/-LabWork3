
public class Main {
    public static void main(String[] args) {

        // Task 2: Create three Product objects
        Product laptop = new Product("Laptop", 1200.0);
        Product mouse = new Product("Mouse", 25.0);
        Product keyboard = new Product("Keyboard", 75.0);

        // Display all products
        System.out.println("SMART WAREHOUSE");
        System.out.println("====================");

        laptop.displayInfo();
        mouse.displayInfo();
        keyboard.displayInfo();

        // Print static variable using class name
        System.out.println("Total products created: "
                + Product.totalProductsCreated);

        // Task 3: Shadowing Challenge
        double price = 500.0;

        // Update the object's price
        laptop.price = 1000.0;

        System.out.println("\nAfter price update:");
        System.out.println("Local price: $" + price);
        System.out.println("Laptop price: $" + laptop.price);
    }
}
