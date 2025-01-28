package singly_linked_list.social_media_network;

import java.util.ArrayList;
import java.util.List;

class UserNode {
    int userID;
    String name;
    int age;
    UserNode next;
    List<Integer> friendIDs;
    public UserNode(int userID, String name, int age) {
        this.userID = userID;
        this.name = name;
        this.age = age;
        this.next = null;
        this.friendIDs = new ArrayList<>();
    }
}
