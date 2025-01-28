package doubly_linked_list.text_editor;

import java.util.Scanner;

public class TextEditorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TextEditor textEditor = new TextEditor(10);

        while (true) {
            System.out.println("\nText Editor Menu:");
            System.out.println("1. Add Text");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Display Current State");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the text to add: ");
                    String text = scanner.nextLine();
                    textEditor.addState(text);
                    break;
                case 2:
                    textEditor.undo();
                    break;
                case 3:
                    textEditor.redo();
                    break;
                case 4:
                    textEditor.displayCurrentState();
                    break;
                case 5:
                    System.out.println("Exiting the text editor.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
