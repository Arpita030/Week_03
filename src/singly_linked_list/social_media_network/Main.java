package singly_linked_list.social_media_network;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SocialNetwork network = new SocialNetwork();

        boolean running = true;
        while (running) {
            network.displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter User ID: ");
                    int userID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    network.addUser(userID, name, age);
                    break;

                case 2:
                    System.out.print("Enter User ID 1: ");
                    int userID1 = scanner.nextInt();
                    System.out.print("Enter User ID 2: ");
                    int userID2 = scanner.nextInt();
                    network.addFriend(userID1, userID2);
                    break;

                case 3:
                    System.out.print("Enter User ID 1: ");
                    int removeID1 = scanner.nextInt();
                    System.out.print("Enter User ID 2: ");
                    int removeID2 = scanner.nextInt();
                    network.removeFriend(removeID1, removeID2);
                    break;

                case 4:
                    System.out.print("Enter User ID 1: ");
                    int mutualID1 = scanner.nextInt();
                    System.out.print("Enter User ID 2: ");
                    int mutualID2 = scanner.nextInt();
                    network.findMutualFriends(mutualID1, mutualID2);
                    break;

                case 5:
                    System.out.print("Enter User ID: ");
                    int displayID = scanner.nextInt();
                    network.displayFriends(displayID);
                    break;

                case 6:
                    network.countFriends();
                    break;

                case 7:
                    network.displayUsers();
                    break;

                case 8:
                    running = false;
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }
}
