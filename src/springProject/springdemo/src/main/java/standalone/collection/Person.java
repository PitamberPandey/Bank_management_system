package standalone.collection;

import java.util.List;

public class Person {
    private List<String> friends;

    // Getter and Setter for friends
    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    // Method to display friends
    public void displayFriends() {
        System.out.println("My best friends are:");
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}
