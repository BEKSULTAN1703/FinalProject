package ui;

import inventory.InventoryManager;
import model.Product;
import order.Order;
import order.OrderManager;

import java.util.Scanner;

public class CLIInterface {
    private Scanner scanner;
    private InventoryManager inventoryManager;
    private OrderManager orderManager;

    public CLIInterface() {
        this.scanner = new Scanner(System.in);
        this.inventoryManager = InventoryManager.getInstance();
        this.orderManager = new OrderManager();
    }

    public void start() {
        int choice;
        do {
            System.out.println("Welcome to the Inventory Management System");
            System.out.println("1. View Inventory");
            System.out.println("2. Add New Product");
            System.out.println("3. Process Order");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewInventory();
                    break;
                case 2:
                    addNewProduct();
                    break;
                case 3:
                    processOrder();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private void viewInventory() {
        // Example: Print all products and their quantities
        inventoryManager.getInventory().forEach((id, item) ->
                System.out.println("Product ID: " + id + ", Quantity: " + item.getQuantity()));
    }

    private void addNewProduct() {
        // Example: Add a new product
        System.out.print("Enter Product ID: ");
        String productId = scanner.next();
        System.out.print("Enter Product Name: ");
        String name = scanner.next();
        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();

        Product newProduct = new Product(productId, name, price);
        inventoryManager.addProduct(newProduct, 0);  // Initial quantity is set to 0
        System.out.println("Product added successfully.");
    }

    private void processOrder() {
        // Example: Process an order
        System.out.print("Enter Order ID: ");
        String orderId = scanner.next();
        Order order = new Order(orderId);
        // Add logic to add products to the order and process it
        orderManager.addOrder(order);
        System.out.println("Order processed successfully.");
    }
}