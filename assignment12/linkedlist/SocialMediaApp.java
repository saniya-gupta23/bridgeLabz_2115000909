import java.util.*;

class User {
    int userID, age;
    String name;
    List<Integer> friends;
    User next;

    public User(int userID, String name, int age) {
        this.userID = userID;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
        this.next = null;
    }
}

class SocialMedia {
    User head;

    public void addUser(int userID, String name, int age) {
        User newUser = new User(userID, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    public void addFriend(int userID1, int userID2) {
        User user1 = searchUser(userID1);
        User user2 = searchUser(userID2);
        if (user1 != null && user2 != null && !user1.friends.contains(userID2)) {
            user1.friends.add(userID2);
            user2.friends.add(userID1);
        }
    }

    public void removeFriend(int userID1, int userID2) {
        User user1 = searchUser(userID1);
        User user2 = searchUser(userID2);
        if (user1 != null && user2 != null) {
            user1.friends.remove(Integer.valueOf(userID2));
            user2.friends.remove(Integer.valueOf(userID1));
        }
    }

    public List<Integer> mutualFriends(int userID1, int userID2) {
        User user1 = searchUser(userID1);
        User user2 = searchUser(userID2);
        List<Integer> mutuals = new ArrayList<>();
        if (user1 != null && user2 != null) {
            for (int friendID : user1.friends) {
                if (user2.friends.contains(friendID)) {
                    mutuals.add(friendID);
                }
            }
        }
        return mutuals;
    }

    public void displayFriends(int userID) {
        User user = searchUser(userID);
        if (user != null) {
            System.out.println(user.friends);
        }
    }

    public User searchUser(int userID) {
        User temp = head;
        while (temp != null) {
            if (temp.userID == userID) return temp;
            temp = temp.next;
        }
        return null;
    }

    public User searchUser(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) return temp;
            temp = temp.next;
        }
        return null;
    }

    public int countFriends(int userID) {
        User user = searchUser(userID);
        return user != null ? user.friends.size() : 0;
    }
}

public class SocialMediaApp {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();
        sm.addUser(1, "Alice", 25);
        sm.addUser(2, "Bob", 24);
        sm.addUser(3, "Charlie", 26);
        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.displayFriends(1);
        sm.displayFriends(2);
        System.out.println(sm.mutualFriends(1, 2));
        System.out.println(sm.countFriends(1));
        sm.removeFriend(1, 2);
        sm.displayFriends(1);
    }
}
