package singly_linked_list.Inventory_Management_system;

import java.util.Scanner;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        InventoryLinkedList inventory = new InventoryLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Inventory Management System ---");
            System.out.println("1. Add Item at Beginning");
            System.out.println("2. Add Item at End");
            System.out.println("3. Add Item at Specific Position");
            System.out.println("4. Remove Item by ID");
            System.out.println("5. Update Item Quantity");
            System.out.println("6. Search Item");
            System.out.println("7. Calculate Total Inventory Value");
            System.out.println("8. Sort Inventory by Name");
            System.out.println("9. Sort Inventory by Price");
            System.out.println("10. Display All Items");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Name, ID, Quantity, Price: ");
                    inventory.addAtBeginning(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter Name, ID, Quantity, Price: ");
                    inventory.addAtEnd(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter Position, Name, ID, Quantity, Price: ");
                    inventory.addAtPosition(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextDouble());
                    break;
                case 4:
                    System.out.print("Enter Item ID to Remove: ");
                    inventory.removeByItemID(scanner.nextInt());
                    break;
                case 5:
                    System.out.print("Enter Item ID and New Quantity: ");
                    inventory.updateQuantity(scanner.nextInt(), scanner.nextInt());
                    break;
                case 6:
                    System.out.print("Enter Item ID or Name to Search: ");
                    inventory.searchItem(scanner.next());
                    break;
                case 7:
                    inventory.calculateTotalValue();
                    break;
                case 8:
                    inventory.sortInventory((a, b) -> a.itemName.compareToIgnoreCase(b.itemName));
                    System.out.println("Sorted by Name.");
                    break;
                case 9:
                    inventory.sortInventory((a, b) -> Double.compare(a.price, b.price));
                    System.out.println("Sorted by Price.");
                    break;
                case 10:
                    inventory.displayAll();
                    break;
                case 11:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
