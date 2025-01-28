package singly_linked_list.Inventory_Management_system;

import java.util.Comparator;

public class InventoryLinkedList {
    private Item head;

    public void addAtBeginning(String itemName, int itemID, int quantity, double price) {
        Item newItem = new Item(itemName, itemID, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    public void addAtEnd(String itemName, int itemID, int quantity, double price) {
        Item newItem = new Item(itemName, itemID, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newItem;
    }

    public void addAtPosition(int position, String itemName, int itemID, int quantity, double price) {
        if (position <= 0) {
            System.out.println("Invalid position!");
            return;
        }
        if (position == 1) {
            addAtBeginning(itemName, itemID, quantity, price);
            return;
        }
        Item newItem = new Item(itemName, itemID, quantity, price);
        Item current = head;
        for (int i = 1; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Position out of bounds!");
                return;
            }
            current = current.next;
        }
        newItem.next = current.next;
        current.next = newItem;
    }

    public void removeByItemID(int itemID) {
        if (head == null) {
            System.out.println("Inventory is empty!");
            return;
        }
        if (head.itemID == itemID) {
            head = head.next;
            System.out.println("Item with ID " + itemID + " removed.");
            return;
        }
        Item current = head;
        while (current.next != null && current.next.itemID != itemID) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Item with ID " + itemID + " not found!");
        } else {
            current.next = current.next.next;
            System.out.println("Item with ID " + itemID + " removed.");
        }
    }

    public void updateQuantity(int itemID, int newQuantity) {
        Item current = head;
        while (current != null) {
            if (current.itemID == itemID) {
                current.quantity = newQuantity;
                System.out.println("Quantity updated for Item ID " + itemID + ".");
                return;
            }
            current = current.next;
        }
        System.out.println("Item with ID " + itemID + " not found!");
    }

    public void searchItem(String nameOrID) {
        boolean found = false;
        Item current = head;
        while (current != null) {
            if (String.valueOf(current.itemID).equals(nameOrID) || current.itemName.equalsIgnoreCase(nameOrID)) {
                System.out.println("Found: Item Name: " + current.itemName + ", ID: " + current.itemID +
                        ", Quantity: " + current.quantity + ", Price: " + current.price);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("Item not found!");
        }
    }

    public void calculateTotalValue() {
        double totalValue = 0;
        Item current = head;
        while (current != null) {
            totalValue += current.price * current.quantity;
            current = current.next;
        }
        System.out.println("Total Inventory Value: " + totalValue);
    }

    public void sortInventory(Comparator<Item> comparator) {
        if (head == null || head.next == null) return;

        head = mergeSort(head, comparator);
    }

    private Item mergeSort(Item head, Comparator<Item> comparator) {
        if (head == null || head.next == null) {
            return head;
        }

        Item middle = getMiddle(head);
        Item nextOfMiddle = middle.next;
        middle.next = null;

        Item left = mergeSort(head, comparator);
        Item right = mergeSort(nextOfMiddle, comparator);

        return merge(left, right, comparator);
    }

    private Item merge(Item left, Item right, Comparator<Item> comparator) {
        if (left == null) return right;
        if (right == null) return left;

        if (comparator.compare(left, right) <= 0) {
            left.next = merge(left.next, right, comparator);
            return left;
        } else {
            right.next = merge(left, right.next, comparator);
            return right;
        }
    }

    private Item getMiddle(Item head) {
        if (head == null) return head;

        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void displayAll() {
        if (head == null) {
            System.out.println("No items in the inventory!");
            return;
        }
        Item current = head;
        while (current != null) {
            System.out.println("Item Name: " + current.itemName + ", ID: " + current.itemID +
                    ", Quantity: " + current.quantity + ", Price: " + current.price);
            current = current.next;
        }
    }
}
