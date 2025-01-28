package singly_linked_list.social_media_network;

import java.util.List;
import java.util.ArrayList;

public class SocialNetwork {
    private UserNode head;

    public SocialNetwork() {
        head = null;
    }

    public void addUser(int userID, String name, int age) {
        UserNode newUser = new UserNode(userID, name, age);
        if (head == null) {
            head = newUser;
        } else {
            UserNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
        System.out.println("User added: " + name);
    }

    public void addFriend(int userID1, int userID2) {
        UserNode user1 = findUserByID(userID1);
        UserNode user2 = findUserByID(userID2);

        if (user1 != null && user2 != null && !user1.friendIDs.contains(userID2)) {
            user1.friendIDs.add(userID2);
            user2.friendIDs.add(userID1);
            System.out.println("Friendship added between " + user1.name + " and " + user2.name);
        } else {
            System.out.println("Friendship already exists or one of the users doesn't exist.");
        }
    }

    public void removeFriend(int userID1, int userID2) {
        UserNode user1 = findUserByID(userID1);
        UserNode user2 = findUserByID(userID2);

        if (user1 != null && user2 != null) {
            user1.friendIDs.remove(Integer.valueOf(userID2));
            user2.friendIDs.remove(Integer.valueOf(userID1));
            System.out.println("Friendship removed between " + user1.name + " and " + user2.name);
        } else {
            System.out.println("One or both users do not exist.");
        }
    }

    public void findMutualFriends(int userID1, int userID2) {
        UserNode user1 = findUserByID(userID1);
        UserNode user2 = findUserByID(userID2);

        if (user1 != null && user2 != null) {
            List<Integer> mutualFriends = new ArrayList<>(user1.friendIDs);
            mutualFriends.retainAll(user2.friendIDs);  // Get intersection of friend lists
            if (!mutualFriends.isEmpty()) {
                System.out.println("Mutual friends between " + user1.name + " and " + user2.name + ": " + mutualFriends);
            } else {
                System.out.println("No mutual friends between " + user1.name + " and " + user2.name);
            }
        } else {
            System.out.println("One or both users do not exist.");
        }
    }

    public void displayFriends(int userID) {
        UserNode user = findUserByID(userID);

        if (user != null) {
            System.out.println(user.name + "'s friends: " + user.friendIDs);
        } else {
            System.out.println("User does not exist.");
        }
    }

    public UserNode findUserByID(int userID) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userID == userID) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public UserNode findUserByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friendIDs.size() + " friends.");
            temp = temp.next;
        }
    }

    public void displayUsers() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println("User ID: " + temp.userID + ", Name: " + temp.name + ", Age: " + temp.age);
            temp = temp.next;
        }
    }

    public void displayMenu() {
        System.out.println("1. Add User");
        System.out.println("2. Add Friend");
        System.out.println("3. Remove Friend");
        System.out.println("4. Find Mutual Friends");
        System.out.println("5. Display Friends");
        System.out.println("6. Count Friends");
        System.out.println("7. Display All Users");
        System.out.println("8. Exit");
    }
}
